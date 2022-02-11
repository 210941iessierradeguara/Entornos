"""  Escribe un programa que solicite al usuario un número N y luego muestre por pantalla
la siguiente ejecución:
1
1 2
1 2 3
1 2 3 4
........
1 2 3 4 ...N """


n = int(input("Introduzca un entero: "))
suma = int(0)
x = int(0)

while n <= 0:
    print("El número ha de se distinto de 0")
    n = int(input("Introduzca un entero: "))
