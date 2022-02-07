#Escribe un programa que lea un número entero por teclado e indique si es par o impar.
x = int(input("Introduzca un entero: "))

print("El número es par") if (x%2) == 0 else print("El número es impar")