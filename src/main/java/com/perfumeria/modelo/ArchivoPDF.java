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
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DecimalFormat;
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
