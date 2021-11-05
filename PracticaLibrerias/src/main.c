#include <stdio.h>
#include "areas.h"
#include "volumenes.h"



int main(int argc, char const *argv[])
{
    int selec;
    float lado;
    float altura;
    float base;
    float profundidad;
    float apotena;
    float perimetro;

    printf("¿Que figura a calcular?");
    scanf(selec);
    printf("1- Área de cuadrado");
    printf("2- Área del Rectágulo");

    switch (selec)
    {
    case 1: /*Cuadrado*/
        printf("¿Cuanto mide el lado?");
        scanf("%f", lado, &lado);
        float areaCuadrado = cuadrado(lado);
        printf("El área del cuadrado de lado %f es: %.2f", lado, areaCuadrado);
        break;
    case 2: /*Rectangulo*/
        printf("¿Cuanto mide la base?");
        scanf("%f", base);
        printf("¿Caunto mide la altura");
        scanf("%f", altura);
        float areaRectangulo = rectangulo(base, altura);
        printf("El área del rectangulo base: %.2f y altura: %.2f es: %.2f", base, altura, areaRectangulo);
        break;
    default:
        printf("");
        break;
    }

    return 0;
}
