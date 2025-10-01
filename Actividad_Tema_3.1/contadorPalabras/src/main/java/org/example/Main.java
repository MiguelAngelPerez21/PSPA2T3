package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main()
    {
        int totalPalabras = 0;

        try
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            String linea;

            while((linea = br.readLine()) != null)
            {
                String[] palabras = linea.trim().split("\\s+");

                if(!linea.trim().isEmpty())
                {
                    totalPalabras += palabras.length;
                }
            }

            System.out.println("Palabras: " + totalPalabras);
        }

        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
