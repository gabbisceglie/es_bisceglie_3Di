#include <stdio.h>
#include <math.h>

int main() {

    double l1,l2, l3, sp, area;

//Inserimento dati
do{
    printf("Inserisci il primo lato del triangolo: ");
    scanf("%lf", &l1);
    if(l1<=0) {
        printf("Valore non valido!\n");
    }
}while(l1<=0);

do{
    printf("Inserisci il secondo lato del triangolo: ");
    scanf("%lf", &l2);
    if(l2<=0) {
        printf("Valore non valido!\n");
    }
}while(l2<=0);

do{
    printf("Inserisci il terzo lato del triangolo: ");
    scanf("%lf", &l3);
    if(l3<=0) {
        printf("Valore non valido!\n");
    }
}while(l3<=0);

//calcolo semiperimetro
sp=(l1+l2+l3)/2;

if(sp>l1 && sp>l2 && sp>l3) {
    area=sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));
    printf("L'area del triangolo è: %lf\n", area);
} else {
    printf("I lati inseriti non formano un triangolo");
}



}