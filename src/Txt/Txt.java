package Txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Txt {

    public static void main(String[] args) throws IOException {
        crearUnaNota();

    }

    public static void crearUnaNota() throws IOException {
        String direccionNota = "/Escritorio/";
        FileWriter nota = new FileWriter(direccionNota += "nota N°1");
        nota.write("pico pa vo klo");
        nota.close();
    }

    public static void crearVariasNotas(int cantidad) throws IOException {
        for (int i = 0; i < cantidad; i++) {
            String direccionNota = "/home/lx699/Cosas NetBeans/";
            direccionNota += "nota " + (i + 1);
            FileWriter nota = new FileWriter(direccionNota);
            nota.write("pico pal que lee");
            nota.close();
        }
    }

    public static void leerNota() throws IOException {
        String nota;
        FileReader archivo = new FileReader("/home/lx699/Cosas NetBeans/nota 1");
        BufferedReader buffer = new BufferedReader(archivo);
        while ((nota = buffer.readLine()) != null) {
            System.out.println(nota);
        }
    }
    public static void leerNotas() throws IOException{
        
    }
}
