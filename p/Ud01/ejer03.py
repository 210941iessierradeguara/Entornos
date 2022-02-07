#Escribe un programa que defina la constante PI como 3.1416 que calcule e imprima el área de un círculo
#cuyo radio se pide por pantalla. (área del circulo = PI x radio2).
pi = float(3.1416)

print("Introduzca el radio del círculo")
Radio = float(input("Radio: "))

Area = pi * pow(Radio, 2)

print("El área del círculo es: " + str(Area))