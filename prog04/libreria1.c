#include "./libreria1.h"
#include <stdio.h>

void incrementa(int n){
    n=++n;

   // printf("[Incrementa]: Aquí el número es: %d \n", n);
}

int incrementa2(int n){
    n=++n;

    printf("[Incrementa2]: Aquí el número es: %d \n", n);

    return n;
}