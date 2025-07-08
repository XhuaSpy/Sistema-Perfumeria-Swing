BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "productos" (
	"id"	INTEGER NOT NULL,
	"nombre"	TEXT NOT NULL,
	"descripcion"	TEXT NOT NULL,
	"can_disponible"	REAL DEFAULT 0,
	"can_lote"	REAL NOT NULL,
	"categoria"	REAL DEFAULT 'Generico',
	"tipo"	TEXT NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
COMMIT;
