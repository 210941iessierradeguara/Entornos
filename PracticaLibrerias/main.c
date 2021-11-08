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
    float apotema;
    float perimetro;

    printf("¿Que figura a calcular?\n");
    printf("1- Área de cuadrado.\n");
    printf("2- Área del Rectágulo.\n");
    printf("3- Área del triangulo.\n");
    printf("4- Área del polígono.\n");
    printf("5- Volúmen del cubo.\n");
    printf("6- Volúmen del paralepipedo.\n");
    scanf("%d", &selec);

    switch (selec)
    {
    case 1: /*Cuadrado*/
        printf("¿Cuanto mide el lado?\n");
        scanf("%f",&lado);
        float areaCuadrado = cuadrado(lado);
        printf("El área del cuadrado de lado: %.2f es: %.2f\n", lado, areaCuadrado);
        break;
    case 2: /*Rectangulo*/
        printf("¿Cuanto mide la base?\n");
        scanf("%f", &base);
        printf("¿Caunto mide la altura?\n");
        scanf("%f", &altura);
        float areaRectangulo = rectangulo(base, altura);
        printf("El área del rectangulo de base: %.2f y altura: %.2f es: %.2f\n", base, altura, areaRectangulo);
        break;
    case 3: /*triangulo*/
        printf("¿Cuanto mide la base?\n");
        scanf("%f", &base);
        printf("¿Cuanto mide la altura?\n");
        scanf("%f", &altura);
        float areaTriangulo = triangulo(base, altura);
        printf("El área del triangulo de base: %.2f y altura: %.2f es: %.2f\n", base, altura, areaTriangulo);
        break;
    case 4: /*Polígono*/
        printf("¿Cuanto mide el perímetro?\n");
        scanf("%f", &perimetro);
        printf("¿Cuanto mide la apotema?\n");
        scanf("%f", &apotema);
        float areaPoli = poligono(perimetro,apotema);
        printf("El área del polígono de perímetro: %.2f y apotema: %.2f es: %.2f\n", perimetro, apotema, areaPoli);
        break;
    case 5:/*cubo*/
        printf("¿Cuanto mide el lado?\n");
        scanf("%f", &lado);
        float volumenCubo = cubo(lado);
        printf("El volúmen del cubo de lado: %.2f es: %.2f\n", lado, volumenCubo);
        break;
    case 6:/*Palepipedo*/
        printf("¿Cuanto mide el lado?\n");
        scanf("%f", &lado);
        printf("¿Cuanto mide de profundidad?\n");
        scanf("%f", &profundidad);
        printf("¿Cuanto mide de alto?\n");
        scanf("%f", &altura);
        float volumenPara = paralepipedo(lado, profundidad, altura);
        printf("El volúmen del paralepipedo de lado: %.2f  profundidad: %.2f y alto: %.2f es: %.2f\n", lado, profundidad, altura,volumenPara);
        break;
    default:
        printf("Eso no se puede\n");
        break;
    }

    return 0;
}
