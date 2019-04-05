package org.fasttrackit;

public class MyException {
    String message;
    MyException(String message)
    {
        this.message=message;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "message='" + message + '\'' +
                '}';
    }
}


