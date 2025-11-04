#include <stdio.h>

int main() {

    int n, cont=0;
    printf("Inserisci un numero positivo: ");
    scanf("%d", &n);

    int arr[n];

    for(int i=0; i<n; i++) {
        printf("Inserire un numero al valore " "%d: ", i);
        scanf("%d", &arr[i]);
    }

    for(int i=0; i<n; i++) {
        if(arr[i]==0){
            printf("Lo zero e' contenuto al valore " "%d", i);
            cont++;
        }
    }

    if(cont==0) {
        printf("\nNon sono stati inseriti 0 in nessun valore.");
    } else {
        printf("\nGli zero contenuti, sono: " "%d: ", cont);
    }

    return 0;
}