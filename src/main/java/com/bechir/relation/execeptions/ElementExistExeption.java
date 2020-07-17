package com.bechir.relation.execeptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ElementExistExeption extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ElementExistExeption(String message) {
        super(message);
    }

}