package com.javanauta.usuario.infrastructure.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String messagem) {
        super(messagem);
    }

    public ResourceNotFoundException(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }
}
