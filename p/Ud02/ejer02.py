# Escribe un programa que lea tres números e indique el mayor de ellos.
x = int(input("Introduzca el primer entero: "))
y = int(input("Introduzca el segundo entero: "))
z = int(input("Introduzca el tercer entero: "))
alto = int()

if x > y:
    alto = x
elif z > x:
    alto = z
else:
    alto = y

print("El número más alto es: " + str(alto))