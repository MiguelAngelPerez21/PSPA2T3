package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String linea = null;

            while((linea = br.readLine()) != null)
            {
                if(linea.length() > 20)
                {
                    System.out.println(linea);
                }

                else
                {
                    System.err.println("Hacen falta al menos 20 cracteres");
                }
            }

        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
