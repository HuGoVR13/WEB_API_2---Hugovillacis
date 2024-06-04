package com.tuuniversidad.biblioteca.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)

public class LibroException extends RuntimeException{
    public LibroException(String message) {
        super(message);
    }

}
