# Escribe un programa que solicite un carácter por teclado e informe de si es
# alfanumérico (letra o dígito) o no.

str = input("Introduzca una cadena o número: ")

if str.isdigit():
    print("Es un dígito")
else:
    print("Es una cadena")