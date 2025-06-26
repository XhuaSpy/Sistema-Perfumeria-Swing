package com.perfumeria.modelo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.perfumeria.configuracion.Config;
import com.perfumeria.modelo.producto.Producto;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * La clase ArchivoPDF permite gestionar la generación de códigos de barras y
 * códigos QR en documentos PDF, así como la selección de la ruta de destino
 * para guardarlos.
 *
 * Utiliza bibliotecas externas para crear imágenes de los códigos y guardarlas
 * localmente.
 *
 * @author Jesus David Peraza
 */
public class ArchivoPDF {

    /**
     * Ruta de destino donde se guardará el archivo PDF generado.
     */
    private String rutaDestino;

    /**
     * Constructor que inicializa la ruta de destino como nula.
     */
    public ArchivoPDF() {
        this.rutaDestino = null;
    }

    /**
     * Asigna la ruta de destino para el archivo PDF.
     *
     * @param ruta ruta absoluta del archivo a guardar
     */
    public void setRutaDestino(String ruta) {
        this.rutaDestino = ruta;
    }

    /**
     * Retorna la ruta de destino actual.
     *
     * @return ruta del archivo
     */
    public String getRutaDestino() {
        return this.rutaDestino;
    }

    /**
     * Permite seleccionar la ruta de destino usando un cuadro de diálogo.
     */
    private void FijarDestino() {
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();
            this.rutaDestino = fileToSave.getAbsolutePath();
        }
    }

    /**
     * Genera un documento PDF con el reporte del stock actual de productos.
     *
     * <p>
     * El archivo se guarda automáticamente en la carpeta {@code pdf/} dentro
     * del proyecto, con un nombre basado en la fecha y hora de generación.
     *
     * <p>
     * El contenido del reporte incluye una tabla con los siguientes datos de
     * cada producto registrado:
     * <ul>
     * <li>ID</li>
     * <li>Tipo de producto</li>
     * <li>Nombre</li>
     * <li>Cantidad por lote</li>
     * <li>Cantidad en stock</li>
     * </ul>
     *
     * <p>
     * Al finalizar la generación, se intenta abrir automáticamente el PDF en el
     * visor predeterminado del sistema operativo.
     *
     * <p>
     * En caso de error, se notifica mediante cuadros de diálogo.
     *
     * @throws DocumentException si ocurre un error al construir el PDF
     * @throws IOException si ocurre un error al guardar o abrir el archivo
     */
    public void CrearPDFReporteStock() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
            String fechaArchivo = sdf.format(Calendar.getInstance().getTime());

            File carpeta = new File("pdf");
            if (!carpeta.exists()) {
                carpeta.mkdirs();
            }

            String nombreArchivo = "pdf/reporte_stock_" + fechaArchivo + ".pdf";
            File archivoPDF = new File(nombreArchivo);

            DecimalFormat formatoMiles = new DecimalFormat("#,###");

            Document pdf = new Document(PageSize.A4, 36, 36, 36, 36);
            PdfWriter.getInstance(pdf, new FileOutputStream(archivoPDF));

            pdf.open();

            Font fuenteTitulo = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD);
            Font fuenteSeccion = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.WHITE);
            Font fuenteContenido = new Font(Font.FontFamily.HELVETICA, 9, Font.BOLDITALIC);

            Paragraph titulo = new Paragraph("Reporte de Stock", fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            pdf.add(titulo);
            pdf.add(Chunk.NEWLINE);

            PdfPTable encabezado = new PdfPTable(new float[]{2f, 2f, 2f, 2f, 2f});
            encabezado.setWidthPercentage(100);

            PdfPCell celdaEncabezado = new PdfPCell(new Phrase("REPORTE DE STOCK", fuenteSeccion));
            celdaEncabezado.setColspan(5);
            celdaEncabezado.setBackgroundColor(BaseColor.BLACK);
            celdaEncabezado.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaEncabezado.setPadding(5);
            encabezado.addCell(celdaEncabezado);

            // Columnas
            encabezado.addCell(new PdfPCell(new Phrase("ID", fuenteContenido)));
            encabezado.addCell(new PdfPCell(new Phrase("TIPO", fuenteContenido)));
            encabezado.addCell(new PdfPCell(new Phrase("NOMBRE", fuenteContenido)));
            encabezado.addCell(new PdfPCell(new Phrase("CANTI. LOTE", fuenteContenido)));
            encabezado.addCell(new PdfPCell(new Phrase("CANTI. STOCK", fuenteContenido)));

            pdf.add(encabezado);

            PdfPTable tablaContenido = new PdfPTable(new float[]{2f, 2f, 2f, 2f, 2f});
            tablaContenido.setWidthPercentage(100);

            for (Producto p : Config.productoRepositorio.listar()) {
                tablaContenido.addCell(new PdfPCell(new Phrase(p.getId().toString(), fuenteContenido)));
                tablaContenido.addCell(new PdfPCell(new Phrase(p.getTipo().toString(), fuenteContenido)));
                tablaContenido.addCell(new PdfPCell(new Phrase(p.getNombre(), fuenteContenido)));
                tablaContenido.addCell(new PdfPCell(new Phrase(p.getUnidadesPorLote() + "", fuenteContenido)));
                tablaContenido.addCell(new PdfPCell(new Phrase(p.getCantidadEnStock() + "", fuenteContenido)));
            }

            pdf.add(tablaContenido);
            pdf.close();

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(archivoPDF);
            } else {
                JOptionPane.showMessageDialog(null, "PDF generado pero no se puede abrir automáticamente.");
            }

        } catch (DocumentException e) {
            JOptionPane.showMessageDialog(null, "Error al generar el PDF: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir o abrir el archivo: " + e.getMessage());
        }
    }

    /**
     * Genera una imagen de código de barras tipo CODE128 a partir de una
     * cadena.
     *
     * @param doc documento PDF asociado
     * @param pw escritor del documento PDF
     * @param datos cadena a codificar
     * @return imagen del código de barras generado
     */
    public Image codBar(Document doc, PdfWriter pw, String datos) {
        PdfContentByte cimg = pw.getDirectContent();

        Barcode128 code128 = new Barcode128();
        code128.setCode(datos);
        code128.setCodeType(Barcode128.CODE128);
        code128.setTextAlignment(Element.ALIGN_CENTER);
        Image img = code128.createImageWithBarcode(cimg, BaseColor.BLACK, BaseColor.BLACK);
        JOptionPane.showMessageDialog(null, "imagen generada");
        img.setAlignment(Element.ALIGN_CENTER);
        return img;
    }

    /**
     * Genera una imagen de código QR a partir de una cadena de texto.
     *
     * @param datos cadena a codificar
     * @return imagen del código QR generado
     * @throws WriterException si ocurre un error al codificar
     * @throws IOException si ocurre un error de escritura de archivo
     * @throws BadElementException si ocurre un error al crear la imagen
     */
    public Image codQr(String datos) throws WriterException, IOException, BadElementException {
        Image img = null;
        try {
            Map<EncodeHintType, Object> hintMap = new EnumMap<>(EncodeHintType.class);
            hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            int ancho = 80, alto = 80;

            QRCodeWriter qrCodeWriter = new QRCodeWriter();
            BitMatrix byteMatrix = qrCodeWriter.encode(datos, BarcodeFormat.QR_CODE, ancho, alto, hintMap);

            int matrixWidth = byteMatrix.getWidth();
            BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
            image.createGraphics();
            Graphics2D graphics = (Graphics2D) image.getGraphics();
            graphics.setColor(Color.BLACK.WHITE);
            graphics.fillRect(0, 0, matrixWidth, matrixWidth);

            graphics.setColor(Color.BLACK);
            for (int i = 0; i < matrixWidth; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    if (byteMatrix.get(i, j)) {
                        graphics.fillRect(i, j, 1, 1);
                    }
                }
            }

            String archiv = System.getProperty("user.dir") + "/QRCod.png";
            File qrFile = new File(archiv);
            ImageIO.write(image, "png", qrFile);
            img = Image.getInstance(archiv);
        } catch (BadElementException | MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar imagen...");
        }
        return img;
    }
}
