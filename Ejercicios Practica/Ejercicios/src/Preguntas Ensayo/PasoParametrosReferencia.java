package Ejercicios;

public class PasoParametrosReferencia {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.valor = 3;
        System.out.println("Valor antes de llamar a la función: " + gato.valor);
        cambiarValor(gato);
        System.out.println("Valor después de llamar a la función: " + gato.valor);
    }

    public static void cambiarValor(Gato gato) {
        gato.valor = gato.valor * 18;
        System.out.println("Valor dentro de la función: " + gato.valor);
    }
}

class Gato {
    int valor;
}