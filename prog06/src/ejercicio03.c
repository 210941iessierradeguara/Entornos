#include <stdio.h>
#include "libreria1.h"
#include "libreria2.h"

int main(){
    int num = 4;
    printf("El número es: %d \n", num);
    num = cuadriplica(num);
    printf("Ahora el número es: %d \n", num);
}