# Escribe un programa que lea un número entero N mayor que 0 y calcule la suma 1+2+3+4+5+...+N.
n = int(input("Introduzca un entero: "))
suma = int(0)
x = int(0)

while n == 0:
    print("El número ha de se distinto de 0")
    n = input("Introduzca un entero: ")

for x in range(n+1):
    suma = suma + x

print(suma)