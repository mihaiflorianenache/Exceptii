package org.fasttrackit;

public class AltaClasa {
    public double metodaPericuloasa (double x, int j) throws ArithmeticException,Exception
    {
        x=x/j;
        if(j==0) throw new Exception("din metoda periculoasa");
        return x;
    }

    public static void main(String[] args)
    {
        double y;
        System.out.println("Inceput program");
        AltaClasa ac=new AltaClasa();
        y=3;
        for(int i=-2;i<3;i++)
        {
            try{
                y=ac.metodaPericuloasa(y,i);
            }catch(ArithmeticException e)
            {
                System.out.println("Impartire cu 0");
            }
            catch(Exception e)
            {
                System.out.println("eroare: "+e.getMessage());
            }
            System.out.println("cat=y= "+y+" impartitor= "+i);
        }

        try{
            Thread.sleep(5000);
            System.out.println("Au trecut cele 5 secunde");
        }catch(InterruptedException e)
        {
            System.out.println("Firul nu a putut astepta 5 secunde din cauza erorii "+e.getMessage());
        }
    }
}

