#include <stdio.h>

enum semana_laboral {LUNES=1, MARTES, MIERCOLES, JUEVES, VIERNES};

int main() {
    int dia = 1;  
    scanf("%d", &dia);  
    
    for (int i = LUNES; i <= VIERNES; i++) {  
        printf("El día de la semana es: %d\n", i);
        
        if ((i % 2) != 0) {
            printf("Hoy es un gran día para Teoría de la Programación\n");  
        }
        
        if (dia == i) {
            break;
        }
    }
}
