package com.example.Employee_Registration_Project;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(String msg){
        super(msg);
    }
}
