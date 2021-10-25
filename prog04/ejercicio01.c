#include <stdio.h>
#include "./libreria1.h"

int main(){
    int num = 4;
    printf("El número es: %d \n", num);
    incrementa(num);
    printf("Ahora el número es: %d \n", incrementa2(num));
}