package View;

import java.util.Scanner;

import Projects.Ejercicio1;
import Projects.Ejercicio2;
import Projects.Ejercicio3;
import Projects.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        // Crear el objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Presentar el proyecto
        System.out.println("***PRÁCTICA***");
        // Presentar el indice de la practica
        System.out.println("índice: ");
        // Opciones de ejercicios
        System.out.println("1. Informe Mensual de Autos Vendidos. ");
        System.out.println("2. Costo de Llamadas Telefónicas Internacionales. ");
        System.out.println("3. Planilla Mensual del Servicio de Agua Potable. ");
        System.out.println("4. Serie Numérica. ");
        // Eleccion del usuario
        System.out.println("Ingrese la opción que desee: ");
        int respuesta = teclado.nextInt();
        // Crear un Switch para que el usuario elija la opcion que desee

        switch (respuesta) {
            case 1:
                // Presentar el programa escogido
                System.out.println("Ha elegido la opción 1: Informe Mensual de Autos Vendidos.");
                Ejercicio1.ejecutarEjercicio1();
                break;

            case 2:
                // Presentar el programa escogido
                System.out.println("Ha elegido la opción 2: Costo de Llamadas Telefónicas Internacionales.");
                Ejercicio2.ejecutarEjercicio2();

                break;

            case 3:
                // Presentar el programa escogido
                System.out.println("Ha elegido la opción 3: Planilla Mensual del Servicio de Agua Potable.");
                Ejercicio3.ejecutarEjercicio3();
                break;
            case 4:
                // Presentar el programa escogido
                System.out.println("Ha elegido la opción 4: Serie Numérica.");
                Ejercicio4.ejecutarEjercicio4();

                break;

            default:

        }

    }
}
