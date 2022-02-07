#Escribe un programa que pase de dólares a euros.
dollar = float(input("Introduzca la cantidad de dólares a convertir: "))
euro = float(0.87)
print()
conversion = dollar * euro
print("En euros " + str(dollar) + " es: " + str(conversion) + " euros")