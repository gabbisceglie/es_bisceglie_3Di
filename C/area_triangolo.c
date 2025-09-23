#include <stdio.h>

int main () {

    float base, altezza, area;

    printf("Inserisci la base: ");
    scanf("%f", &base);

    printf("Inserisci l'altezza: ");
    scanf("%f", &altezza);

    area=base*altezza/2;

printf("L'area è: %f ", area);




    return 0;
}