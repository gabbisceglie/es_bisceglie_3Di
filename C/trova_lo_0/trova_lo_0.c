#include <stdio.h>

int main() {

    int n, cont=0;

    //input
    do {
    printf("Inserisci un numero positivo: ");
    scanf("%d", &n);
    } while(n<=0);

    int arr[n];

    //input
    for(int i=0; i<n; i++) {
        printf("Inserire un numero al valore %d: ", i);
        scanf("%d", &arr[i]);
    }

    //elaborazione
    for(int i=0; i<n; i++) {
        if(arr[i]==0){
            cont++;
        }
    }

    //output
    if(cont==0) {
        printf("\nNon sono stati inseriti 0 in nessun valore.");
    } else {
        printf("\nGli zero contenuti, sono: %d ", cont);
    }

    return 0;
}