package org.fasttrackit;

import java.io.IOException;

public class ExceptionMethods {
    public static void main(String[] args)
    {
        try{
            throw new Exception("Aceasta este o exceptie !");
        }catch(Exception e)
        {
            System.out.println("Caught exception");
            System.out.println("e.getMessage(): "+e.getMessage());
            System.out.println("e.toString(): "+e.toString());
            System.out.println("e.printStackTrace(): ");
            e.printStackTrace();
        }

        System.out.println("Apasati <ENTER> pentru terminare...");
        try{
            char a=(char)System.in.read();
            if((int)a!=(int)'\n') throw new Exception("Nu ati apsat enter");
        }catch(IOException e)
        {
            System.out.println("Nu se poate citi caracterul din cauza exceptiei "+e.getMessage());
        }
        catch(Exception e)
        {

        }
    }
}

