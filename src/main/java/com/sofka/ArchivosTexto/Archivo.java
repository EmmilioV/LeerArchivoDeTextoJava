package com.sofka.ArchivosTexto;

import java.io.*;

public class Archivo
{
    public void leerArchivo(String ruta)
    {
        try {
            FileReader reader = new FileReader(ruta);
            BufferedReader buffer = new BufferedReader(reader);

            String linea = buffer.readLine();
            while (linea != null)
            {
                System.out.println(linea);
                linea = buffer.readLine();
            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
