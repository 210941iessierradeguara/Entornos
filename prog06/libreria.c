#include "./libreria.h"

int dobla(int n){
    n = n*2;
    return n;
}

int cuadriplica(int m){
    int m1;
    m1 = dobla(m);
    int m2;
    m2 = dobla(m1);
    return m2;
}