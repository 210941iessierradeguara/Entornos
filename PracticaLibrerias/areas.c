#include "areas.h"

float cuadrado(float lado){
    return lado*lado;
}

float rectangulo(float base, float altura){
    return base*altura;
}

float triangulo(float base, float altura){
    return (base*altura)/2;
}

float poligono(float perimetro, float apotema){
    return (perimetro*apotema)/2;
}