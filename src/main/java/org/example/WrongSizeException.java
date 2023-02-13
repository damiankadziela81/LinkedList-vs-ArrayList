package org.example;

class WrongSizeException extends RuntimeException{
    private static final String ERROR_MESSAGE = "Invalid size entry!";

    public WrongSizeException(){
        super(ERROR_MESSAGE);
    }
}
