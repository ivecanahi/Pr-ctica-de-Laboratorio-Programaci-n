package Projects;

import java.util.Scanner;
import controller.util.Utilidades;

public class Ejercicio4 {
    
    // Serie: (1 / 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….

    //Generar un numero impar como denominador
    private static int generarImpar(int numero) {
        //variable para el primer numero impar 
        int resultado = 1;
        //Condicion si el numero es mayor a 1 continue generando numeros impares
        if (numero > 1) {
            //Bucle para incrementar el valor a 2 para calcular el siguiente numero impar 
            //1 +2 = 3 ---- 3 + 2 = 5.................
            for (int i = 1; i < numero; i++) {
                resultado += 2;
            }
        }
        return resultado;
    }

    //Generar un numerador 
    private static int generarNumerador(int numero) {
        //resultado valor actual 
        int resultado = 1;
        //valor anterior de la secuencia
        int anterior = 0;
        //Variable temporal para controlar el intercambio.
        int temp;
        //Bucle para calcular de la siguiente manera N(n)=N(n−1)+N(n−2).
        for (int i = 1; i < numero; i++) {
            temp = resultado;
            resultado += anterior;
            anterior = temp;
        }
        return resultado;
    }


    public static void ejecutarEjercicio4() {
        Scanner sc = new Scanner(System.in);
        //Solicitar el numero que el usuario quiere que se genere dentro de la serie
        System.out.println("Ingrese el número de términos de la serie: ");
        //Leer numero
        String numero = sc.nextLine();
        //Convertir la cadena a numeros enteros mediante utilidades
        int numSerie = Utilidades.transformStringInt(numero);
        //Variable para la presentacion de la serie
        String serie = "S = ";

        //Condicion para que los numeros de la serie sean mayores a 0 
        if (numSerie > 0) {
            //Variable acumulativa para el resultado total
            float resultado = 0.0f;
            //Variable para la asignacion de signos segun del patron 
            int contadorSignos = 0;

            //Bucle desde 1 hasta el numero de elementos de la serie 
            for (int i = 1; i <= numSerie; i++) {
                //Generar un numerador 
                int numerador = generarNumerador(i);
                //Generar impar para denominador
                int denominador = generarImpar(i);
                //Calcular el exponente
                int exponente = 2 * i;
                //Calcular el valor del termino 
                float termino = (float) Math.pow( numerador / denominador, exponente);

                // Cambiar signo según el patrón: + - - + +
                if (contadorSignos == 0 || contadorSignos == 3 || contadorSignos == 4) {
                    //Unir cada termino con su signo respectivo
                    serie += "(" + numerador + "/" + denominador + ")^" + exponente + " + ";
                    //Calcular la operacion total 
                    resultado += termino;
                } else {
                    serie += "(" + numerador + "/" + denominador + ")^" + exponente + " - ";
                    resultado -= termino;
                }
                
                //Reinicia lso signos como en el patron (cada 5 terminos)
                contadorSignos = (contadorSignos + 1) % 5; 
            }

          //Presentar la serie generada
            System.out.println("Serie generada: ");
            System.out.println(serie);
            System.out.println("El resultado es: " + resultado);
        } else {
            System.out.println("Ingrese un número mayor a 0");
        }
    }
}
