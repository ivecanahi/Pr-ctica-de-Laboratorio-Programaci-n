package Projects;

import java.util.Scanner;
import controller.util.Funciones;

public class Ejercicio1 {
    public static void ejecutarEjercicio1() {
        // Crear el objeto Scanner
        Scanner teclado = new Scanner(System.in);

        // Presentar el programa
        System.out.println("*** Informe de Ventas al mes por empleado ***");
        // Pedir los datos personales
        System.out.println("Datos Personales:");

        // Solicitar el nombre del vendedor
        System.out.println("Ingrese su nombre: ");
        // Almacenar el nombre del vendedor
        String nombreVendedor = teclado.nextLine();
        // Presentar el nombre del vendedor de forma individual
        System.out.println("Informe de Ventas Individual de " + nombreVendedor);

        // Solicitar la cantidad de autos vendidos
        System.out.println("¿Cuántos autos ha vendido este mes? ");
        // Almacenar la cantidad de autos vendidos
        int nAutos = teclado.nextInt();

        // Variables
        // Total acumulado de ventas de autos
        float totalPrecioAutos = 0.0f;
        // Total acumulado de comisiones por auto
        float totalComision = 0.0f;
        // Crear instancia de la clase Funciones
        Funciones calculos = new Funciones();

        // Bucle para cada auto vendido
        for (int cont = 1; cont <= nAutos; cont++) {
            System.out.println("Precio del auto " + cont + " vendido: ");
            // Leer el precio del auto
            float precioAuto = teclado.nextFloat();
            // Acumular el precio de los autos vendidos
            totalPrecioAutos += precioAuto;
            // Calcular y acumular la comisión para cada auto
            totalComision += calculos.calcularComisionPorAuto(precioAuto);
        }

        // Calcular las utilidades totales
        float totalUtilidades = calculos.calcularUtilidades(totalPrecioAutos);

        // Calcular el sueldo final del empleado

        float sueldoFinal = calculos.calcularSueldoFinal(totalComision, totalUtilidades);
        // Mostrar el informe final de autos vendidos con su sueldo
        System.out.println("*** Desglose del Informe Mensual ***");
        System.out.println("Nombre del vendedor: " + nombreVendedor);
        System.out.println("Total de autos vendidos: " + nAutos);
        System.out.println("Total de ventas realizadas: $" + totalPrecioAutos);
        System.out.println("Total de comisiones acumuladas: $" + totalComision);
        System.out.println("Total de utilidades (5% de ventas): $" + totalUtilidades);
        System.out.println("Sueldo final: $" + sueldoFinal);
    }
}
