package com.teachmeskills.lesson13.exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String message){
        super(message);
    }
}
