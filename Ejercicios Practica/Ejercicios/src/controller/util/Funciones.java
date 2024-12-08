package controller.util;

import Projects.Ejercicio3;

public class Funciones {

    //EJERCICIO 1

    // Declarar Variables
    // Sueldo base del empleado
    private final float sueldoBaseObligatorio = 2500.00f; 
    // Comisión por cada auto vendido que supere 10,000
    private final float comisionAutosVendidos = 250.00f;  
    // Porcentaje de utilidad sobre ventas totales
    private final float porcentajeUtilidad = 0.05f;       

    // Método para calcular la comisión por cada auto
    public float calcularComisionPorAuto(float precioAuto) {
        // Condicion si el precio supera 10,000, se suma 250 de comisión
        if (precioAuto > 10000) {
            return comisionAutosVendidos; 
        } else // Si el precio no supera 10,000, no se suma comisión
        return 0.0f; 
    }

    // Método para calcular las utilidades totales sobre las ventas
    public float calcularUtilidades(float totalPrecioAutos) {
        // Utilidad = total ventas * porcentaje
        return totalPrecioAutos * porcentajeUtilidad; 
    }

    // Método para calcular el sueldo final del empleado
    public float calcularSueldoFinal(float totalComision, float totalUtilidades) {
        // Suma de sueldo base, comisiones y utilidades
        return sueldoBaseObligatorio + totalComision + totalUtilidades; 
    }
    
    //EJERCICIO 2

    public enum Tarifa{
        //Definir los valores de enum
   AMERICA_DEL_NORTE____12(2.75f),
   AMERICA_CENTRAL______15(1.89f), 
   AMERICA_DEL_SUR______18(1.60f),
   EUROPA_______________19(3.50f),
   ASIA_________________23(4.50f), 
   AFRICA_______________25(3.10f),
   OCEANIA______________29(3.00f),
   RESTO_DEL_MUNDO______31(6.00f); 
   ;
   //Atributo que sirve para almacenar el valor por zona por minuto 
   private float precioMinuto; 
   private Tarifa(float value){
    precioMinuto = value; 
   }
   public float getTarifa (){
    return precioMinuto; 
   }
   }

   //EJERCICIO 3
   // Precio base en rango 0-15
       private float valorBase = 3.00f; 
       // Adicional para rango 15-25 
       private float precioRango1 = 0.10f; 
       // Adicional para rango 25-40 
       private float precioRango2 = 0.20f; 
       // Adicional para rango 40-60 
       private float precioRango3 = 0.30f; 
        // Adicional para rango más de 60 
       private float precioRango4 = 0.35f;
   
       // Calcular el precio normal
       public float calcularPrecioNormal(float cantidadConsumoM3) {
           float precioTotal = 0.0f;
        //Condicion para calcular el precio segun el rango
        //Se multiplica el valor base por 15 (rango mayor base) + cantidad de consumo - 15 del precio base * valor de rango x
        //Rango 1   
        if (cantidadConsumoM3 <= 15) {
               precioTotal = cantidadConsumoM3 * valorBase;
           } 
           //Rango 2
           else if (cantidadConsumoM3 <= 25) {
               precioTotal = (15 * valorBase) + ((cantidadConsumoM3 - 15) * precioRango1);
           } 
           //Rango 3
           else if (cantidadConsumoM3 <= 40) {
               precioTotal = (15 * valorBase) + (10 * precioRango1) + ((cantidadConsumoM3 - 25) * precioRango2);
           } 
           //Rango 4
           else if (cantidadConsumoM3 <= 60) {
               precioTotal = (15 * valorBase) + (10 * precioRango1) + (15 * precioRango2) + ((cantidadConsumoM3 - 40) * precioRango3);
           } 
           //Rango 5
           else {
               precioTotal = (15 * valorBase) + (10 * precioRango1) + (15 * precioRango2) + (20 * precioRango3) + ((cantidadConsumoM3 - 60) * precioRango4);
           }
   
           return precioTotal;
       }
   
       // Descuento para discapacidad segun el porcentaje
       public float descuentoDiscapacidadRangoBase(float precioNormal, float cantidadConsumoM3, float porcentajeDiscapacidad) {
        //Condicion para verificar el descuento de discapacidad segun el porcentaje brindado dentro del rango
        if (cantidadConsumoM3 > 0 && cantidadConsumoM3 <= 15) {
            //Calcular el descuento total de discapacidad
            float descuentoDiscapacidad = precioNormal *(porcentajeDiscapacidad/100);
               return descuentoDiscapacidad;
           }
           return 0.0f;
       }
   
       // Descuento para tercera edad segun el rango 
       public float descuentoTerceraEdadRangoBase(float precioNormal, float cantidadConsumoM3) {
        //Condicion para indicar el valor de descuento dentro del rango 1   
        if (cantidadConsumoM3 > 0 && cantidadConsumoM3 <= 15) {
            //Calcular el descuento dentro del rango 1 = 50%
            float descuentoTerceraEdadRangoBase = precioNormal * 0.50f;
               return descuentoTerceraEdadRangoBase; 
           }
           //Calcular el descuento fuera del rango 1 unicamente en el rango 1 
           //15 (rango máximo)*valor base ($3) * 30 (30 % descuento)
           float descuentoTerceraEdad = (15*valorBase)*30;
           return descuentoTerceraEdad; 
       }
   }
   




