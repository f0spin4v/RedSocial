package com.example.redsocial.exeptions;

public class DatosNoIngresadosException extends Exception {
    public DatosNoIngresadosException(String mensaje){
        super(mensaje);
    }
}
