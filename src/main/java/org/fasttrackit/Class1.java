package org.fasttrackit;

public class Class1 {
    private void Exceptie() {
        System.out.println("Inceput program");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException exception) {
            System.out.println("Firul nu a putut asteptat 5 secunde din cauza erorii " + exception.getMessage());
        }
    }

    /*private void callWaitKeyboard()
    {
        try{
            waitKeyboard();
        }catch(MyException exception)
        {
            callWaitKeyboard();
        }
    }*/

   /* private void waitKeyboard() throws MyException,IOException {
        System.out.println("Asteapta un enter");
        try {
            char a = (char) System.in.read();
            if ((int) a != 13) throw MyException("Nu ati tastat ENTER");
        }catch(IOException exception)
        {
            System.out.println("Nu se poate citi caracterul introdus din cauza erorii "+exception.getMessage());
        }
    }*/

    public static void main(String[] args)
    {

    }
}

