package com.example.redsocial.exeptions;

public class AccesoNoAutorizadoException extends  Exception{
    public AccesoNoAutorizadoException(String message) {
        super(message);
    }
}
