import math
# Escribe un programa que indique si un número entero leído por teclado se puede
# expresar como el cuadrado de un número entero. P.ej el número 9 se puede expresar
# como el cuadrado de 3, mientras que el 8 no.
x = int(input("Introduzca un entero: "))
raiz = float(math.sqrt(x))

if x%raiz == 0:
    print("El número " + str(x) + " Es el cuadrado de " + str(raiz))
else:
    print("El número " + str(x) + " No es cuadrado de nadie")
