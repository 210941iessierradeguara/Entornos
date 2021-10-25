#include <stdio.h>

void saludar(){
    printf("Hola Mundo \n");
}

void saludar_persona(char nombre[]){
    printf("Hola %s\n", nombre);
}

int main(int argc, char const *argv[])
{
    char nombre[]="clase";
    saludar();
    saludar_persona(nombre);
    return 0;
}