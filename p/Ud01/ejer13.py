#Escribe un programa que lea del teclado una letra e imprima su carácter ASCII así como los tres siguientes
#caracteres:
c1 = input("Introduzca un caracter: ")
c2 = ord(c1) + 1
c3 = ord(c1) + 2
c4 = ord(c1) + 3

print("El valor asccii de {} es de {}".format(c1, ord(c1)))
print("Los tres siguientes valores serían {}, {}, {}".format(chr(c2),chr(c3), chr(c4)))