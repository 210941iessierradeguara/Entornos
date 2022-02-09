# Escribe un programa que lea dos números e indique si uno de ellos es múltiplo de otro.
x = float(input("Introduzca el número más grande: "))
y = float(input("Introduzca el número inferior: "))

if x%y == 0:
    print("Son múltiplos")
else:
    print("No son múltiplos")