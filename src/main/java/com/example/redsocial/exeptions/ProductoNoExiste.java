package com.example.redsocial.exeptions;
public class ProductoNoExiste extends Exception {
    public ProductoNoExiste(String mensaje){
        super(mensaje);
    }
}
