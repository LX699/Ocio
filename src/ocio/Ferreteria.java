package ocio;

import java.util.ArrayList;
import java.util.Scanner;

public class Ferreteria {

    static ArrayList<String> productos = new ArrayList<>();
    static ArrayList<Integer> cantidad = new ArrayList<>();

    public static void main(String[] args) {
        ejecuar();

    }

    public static void ejecuar() {
        Scanner intro = new Scanner(System.in);
        menu();
        int opcion = 0;
        try {
            System.out.println("\ningrese la opcion deseada");
            opcion = intro.nextInt();

        } catch (Exception e) {
            System.out.println("\n------------------------------");
            System.out.println("--Ingrese caracteres validos--");
            System.out.println("------------------------------\n");
            ejecuar();
        }
        switch (opcion) {
            case 1:
                agregarProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0);
        }
    }

    public static void menu() {
        System.out.println("1- Ingresar nuevo producto");
        System.out.println("2- Quitar un producto");
        System.out.println("3- Aumentar Stock");
        System.out.println("4- Disminur Stock");
        System.out.println("5- salir");
    }

    public static void agregarProducto() {
        Scanner intro = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nombre = intro.next();
        System.out.println("El nombre del producto es --" + nombre + "-- ¿Esta bien escrito? Si/No");
        if (verificar() == true) {
            productos.add(nombre);
            cantidad.add(0);
        }

    }

    public static boolean verificar() {
        Scanner intro = new Scanner(System.in);
        String opcion = intro.next();
        if (opcion == "no") {
            agregarProducto();
        } else if (opcion == "si") {
            return true;
        } else if (opcion != "no" || opcion != "si") {
            System.out.println("\n Ingrese una opcion valida (Si/No)");
            verificar();
        }
        return false;

    }
}
//1.Asociación:Relación"estructural",elobjetoespartedelaestructurapropiadelaconstruccióndelobjeto.Unobjetoestáintegradoporatributosquesonasuvezotrosobjetos.
//1.1.Agregación:Seagreganobjetosaotroobjetoatravésdeunmétodoyseincluyeenunaestructuracontenedoradeobjetos,comounarray.
//1.2.Composición:esuncasoparticulardeagregaciónygeneralmentesedicequesoloaporta"semántica"peroqueenlavidarealesraroqueseimplemente.
