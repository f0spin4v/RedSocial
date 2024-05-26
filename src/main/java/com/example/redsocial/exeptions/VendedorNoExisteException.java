package com.example.redsocial.exeptions;

public class VendedorNoExisteException extends Exception{
    public VendedorNoExisteException(String message) {
        super(message);
    }
}
