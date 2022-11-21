package com.example.examen_1_parcial_pm1.clases;

public class Transacciones {
    public static final String nameDatabase = "DBRegistro";

    public static final String tablaContactos = "contactos";


    public static final String id = "id";
    public static final String nombre = "nombre";
    public static final String telefono = "telefono";
    public static final String imagen = "imagen";
    public static final String cId = "id";


    public static final String CreateTableContactos = "CREATE TABLE contactos(id INTEGER PRIMARY KEY AUTOINCREMENT, nombre  TEXT, telefono TEXT, imagen BLOB)";
    public static final String DropTableContactos = "DROP TABLE EXISTS contactos";

}
