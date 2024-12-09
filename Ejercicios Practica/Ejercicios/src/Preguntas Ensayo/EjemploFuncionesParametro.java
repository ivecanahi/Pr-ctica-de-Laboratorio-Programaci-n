package Ejercicios;

public class EjemploFuncionesParametro {
    public static void main(String[] args) {
        int precioLibra = 2; 
        System.out.println("Precio por libra: " + precioLibra);
        cambiarValor(precioLibra);
        System.out.println("Precio después de llamar a la función: " + precioLibra);
    }

    public static void cambiarValor(int valor) {
        valor = valor * 5; 
        System.out.println("Valor dentro de la función: " + valor);
    }
}
