package Projects;

import java.util.Scanner;
import controller.util.Funciones.Tarifa;

public class Ejercicio2 {
    public static void ejecutarEjercicio2() {
        //Imprimir la lista de claves según la Zona Geográfica
        System.out.println("***Lista de Precios por Minuto segun la Zona Geográfica***");
        //Bucle para iterar los valores del enum Tarifa
        for (Tarifa e : Tarifa.values()) {
            System.out.println(e.toString());
        }
        //Solicitar al usuario su zona geográfica mediante la clave de las mismas
        System.out.println("Ingrese la clave según su Zona Geográfica: ");
        Scanner sc = new Scanner(System.in);
        //Declarar variables a usar
        int claveZona = sc.nextInt();
        float precioTotal = 0.0f;
        //Crear un switch con cada caso de clave
        switch (claveZona) {
            //Caso 12 ---> AMERICA NORTE
            case 12:
            //Presentar la zona
                System.out.println("Zona: América del  Norte ");
                //Pedir los minutos hablados
                System.out.println("Ingrese los Minutos Hablados: ");
                //Leer minutos
                float cadena_minutos_AN = new Scanner(System.in).nextFloat();
                //Calcular el precio total
                precioTotal = precioTotal + cadena_minutos_AN * (Tarifa.AMERICA_DEL_NORTE____12.getTarifa());
                //Presentar el total a pagar
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 15 ---> AMERICA CENTRO
            case 15:
                System.out.println("Zona: América Central ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_AC = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_AC * (Tarifa.AMERICA_CENTRAL______15.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 18 ---> AMERICA SUR
            case 18:
                System.out.println("Zona: América del Sur ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_AS = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_AS * (Tarifa.AMERICA_DEL_SUR______18.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 19 ---> EUROPA
            case 19:
                System.out.println("Zona: Europa ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_E = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_E * (Tarifa.EUROPA_______________19.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 23 ---> ASIA
            case 23:
                System.out.println("Zona: Asia ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_A = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_A * (Tarifa.ASIA_________________23.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 25 ---> AFRICA
            case 25:
                System.out.println("Zona: Africa ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_AF = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_AF * (Tarifa.AFRICA_______________25.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 29 ---> OCEANIA
            case 29:
                System.out.println("Zona: Oceanía ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_O = new Scanner(System.in).nextFloat();
                precioTotal = precioTotal + cadena_minutos_O * (Tarifa.OCEANIA______________29.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //Caso 19 ---> RESTO MUNDO
            case 31:
                System.out.println("Zona: Otras partes del Mundo ");
                System.out.println("Ingrese los Minutos Hablados: ");
                float cadena_minutos_W = new Scanner(System.in).nextFloat();

                precioTotal = precioTotal + cadena_minutos_W * (Tarifa.RESTO_DEL_MUNDO______31.getTarifa());
                System.out.println("Total a pagar: $" + precioTotal);
                break;
            //PARA OPCIONES NO VALIDAS
                default: 
                System.out.println("Ingrese una clave válida");
        }
        
        } 

    }
