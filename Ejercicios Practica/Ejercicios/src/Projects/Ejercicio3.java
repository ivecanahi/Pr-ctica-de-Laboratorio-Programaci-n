package Projects;

import java.util.Scanner;
import controller.util.Funciones;

public class Ejercicio3 {
    public static void ejecutarEjercicio3() {
         //Llamar a funciones
         Funciones funciones = new Funciones();
        System.out.println("***Planilla Agua Potable***");
        //Objeto Scanner
        Scanner sc = new Scanner(System.in);

        //Pedir al usuario el mes en el que quiere emitir el informe
        System.out.println("Ingrese el mes actual: ");
        //Guardar variable mes en String
        String mes = sc.nextLine();

        // Pedir al usuario la cantidad del consumo en m^3
        System.out.println("Ingrese el consumo en m^3 (metros cúbicos) del agua consumida en el mes " + mes + ": ");
        //Guardar variable cantidad de consume en float
        float cantidadConsumoM3 = sc.nextFloat();

        //Pedir al usuario su edad
        System.out.println("Ingrese su edad: ");
        //Guardar la variable edad en int
        int edad = sc.nextInt();
        sc.nextLine(); 

        // Verificar que el usuario tenga o no discapacidad
        //Preguntar si el usuario posee discapacidad
        System.out.println("¿Usted posee alguna discapacidad? (Ingrese SI o NO): ");
        //Guardad la respuesta en string
        String discapacidad = sc.nextLine();

        // Calcular el precio base 
        float precioNormal = funciones.calcularPrecioNormal(cantidadConsumoM3);

        // Variables para los descuentos
        //Discapacidad
        float descuentoDiscapacidad = 0.0f;
        //Tercera edad
        float descuentoTerceraEdad = 0.0f;

        // Si la respuesta es si enton es
        if (discapacidad.equalsIgnoreCase("SI")) {
            //Pedir al usuario el porcentaje de discapacidad que tiene
            System.out.println("Ingrese el porcentaje de discapacidad que posee: ");
            //Guardar el porcentaje de discapacidad en float
            float porcentajeDiscapacidad = sc.nextFloat();
               //Llamar funciones para calcular el descuento 
            descuentoDiscapacidad = funciones.descuentoDiscapacidadRangoBase(precioNormal, cantidadConsumoM3, porcentajeDiscapacidad);
        }

        // Aplicar descuento por tercera edad si corresponde a partir de los 65 
        if (edad > 65) {
            //Llamar funciones para calcular el descuento 
            descuentoTerceraEdad = funciones.descuentoTerceraEdadRangoBase(precioNormal, cantidadConsumoM3);
        }

        // Calcular el total de descuentos (Tercera edad y discapacidad)
        float totalDescuento = descuentoDiscapacidad + descuentoTerceraEdad;

        // Calcular el precio con descuentos anteriores
        float precioFinalServicioAgua = precioNormal - totalDescuento;

        // Calcular los impuestos (alcantarillado) y tasas (basura y procesamiento)
        //Alcantarillado = 35 %
        float impuestoAlcantarillado = precioFinalServicioAgua * 0.35f; 
        //Basura 
        float tasaBasura = 0.75f; 
        //Procesamiento 
        float tasaProcesamiento = 0.50f; 

        // Calcular el total final a pagar
        float totalFinal = precioFinalServicioAgua + impuestoAlcantarillado + tasaBasura + tasaProcesamiento;

        // Mostrar los detalles
        System.out.println("Detalle del informe en el mes de " +mes+ ":");
        System.out.println("Consumo de agua: " + cantidadConsumoM3 + " m^3");
        System.out.println("Total sin descuentos: $" + precioNormal);
        System.out.println("Descuento por discapacidad: -$" + descuentoDiscapacidad);
        System.out.println("Descuento por tercera edad: -$" + descuentoTerceraEdad);
        System.out.println("Precio con descuentos aplicados: $" + precioFinalServicioAgua);
        System.out.println("Impuesto de alcantarillado (35%): $" + impuestoAlcantarillado);
        System.out.println("Tasa por recolección de basura: $" + tasaBasura);
        System.out.println("Tasa por procesamiento de datos: $" + tasaProcesamiento);
        System.out.println("Total a pagar: $" + totalFinal);
    }

}
