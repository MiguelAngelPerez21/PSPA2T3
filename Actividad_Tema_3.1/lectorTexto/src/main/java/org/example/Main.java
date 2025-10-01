package org.example;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static void main(String[] args)
    {
        try(InputStream is = Main.class.getResourceAsStream("/entrada.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is)))
        {
            String entrada = null;

            while((entrada = br.readLine()) != null)
            {
                System.out.println(entrada);
            }
        }

        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
