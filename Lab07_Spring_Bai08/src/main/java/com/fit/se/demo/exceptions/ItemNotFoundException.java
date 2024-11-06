package com.fit.se.demo.exceptions;

public class ItemNotFoundException extends  RuntimeException {
    public ItemNotFoundException(String message) {
        super(message);
    }
}
