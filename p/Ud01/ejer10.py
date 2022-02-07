#Escribe un programa que solicite dos enteros y visualice true si se han introducido en orden ascendente o
#false en caso contrario.
x = int(input("Introduzca el primer número: "))
y = int(input("Introduzca el segundo número: "))

if x < y:
    print("Se han introducido los números de forma ascendente.")
else:
    print("Se han introducido los números de forma descendente.")