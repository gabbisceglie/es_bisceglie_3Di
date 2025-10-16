#include <stdio.h>

int main() {

    int num, bin=0;

do {
    printf("Inserisci un numero da convertire: ");
    scanf("%d", &num);
} while(num<0);

while(num>0) {

    if(num%2==0) {
        bin=0;
    } else {
        bin=1;
        num--;
    }

    num=num/2;
    printf("Il numero in binario e': %d\n", bin);
}

        return 0;
}