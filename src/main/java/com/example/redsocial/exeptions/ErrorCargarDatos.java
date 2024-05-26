package com.example.redsocial.exeptions;

public class ErrorCargarDatos extends Exception{
    public ErrorCargarDatos(String mensaje){
        super(mensaje);
    }
}
