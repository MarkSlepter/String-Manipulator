package com.teachmeskills.lesson13.exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super();
    }
    public WrongPasswordException(String message){
        super(message);
    }
}
