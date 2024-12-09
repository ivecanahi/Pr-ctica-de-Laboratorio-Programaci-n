package Ejercicios;

import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean band = true;
        int numeroCorrecto = 10;
        int oportunidades = 3;

        do {
            System.out.println("Adivine el número (entre el 0 al 15) tienes 3 oportunidades");
            int numero = sc.nextInt();
            if (numero == numeroCorrecto) {
                System.out.println("Felicitaciones, has adivinado ");
                band = false;
            } else {
                oportunidades--;
                if (oportunidades > 0) {
                    System.out.println("Intenta de nuevo.");
                } else {
                    System.out.println("Se acabaron las oportunidades, el número correcto es " + numeroCorrecto);
                    band = false;

                }
            }
        } while (band);

    }
}
