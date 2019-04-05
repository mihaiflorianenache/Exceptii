package org.fasttrackit;

import java.io.IOException;

public class Rethrowing {
    public static void f() throws Exception{
        System.out.println("Exceptia apare in metoda f()");
        throw new Exception("aruncata din f()");
    }

    public static void g() throws Throwable
    {
        try{
            f();
        }
        catch(Exception e){
            System.out.println("in g(), e.printStackTrace()");
            e.getMessage();
            throw e;
        }
    }

    public static void main(String[] args) throws Throwable{
        try{
            g();
        }catch(Exception e)
        {
            System.out.println("Caught in main, e.printStackTrace()");
            e.getMessage();
        }

        System.out.println("Apasati <ENTER> pentru terminare");
        try{
            char a=(char)System.in.read();
        }catch(IOException e)
        {
            System.out.println("NU se poate citi caracterul apasat din cauza exceptiei: "+e.getMessage());
        }
    }
}

