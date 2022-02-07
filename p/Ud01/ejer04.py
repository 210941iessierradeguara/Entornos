# Escribe un programa que pase de euros a dólares (1€ = 1,15$ 7-02-2022).
dollar = float(1.15)
euro = float(input("Introduzca la cantidad de euros a convertir: "))
print()
conversion = euro * dollar
print("En dolares " + str(euro) + " es: " + str(conversion) + " dólares")