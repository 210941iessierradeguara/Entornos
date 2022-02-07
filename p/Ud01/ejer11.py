#Escribe un programa que solicite tres enteros y visualice true si se han introducido en orden ascendente o
#false en caso contrario.
x = int(input("Introduzca el primer número: "))
y = int(input("Introduzca el segundo número: "))
z = int(input("Introduzca el tercer número: "))

if x > y:
    print("No se han introducido de forma ascendente.")
elif y > z:
    print("No se han introducido de forma ascendente.")
else:
    print("Se han introducido de forma ascendente")