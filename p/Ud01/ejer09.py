#Escribe un programa que solicite la longitud y anchura en metros de una habitación e imprima su superficie
#con cuatro decimales.
longi = float(input("Introduzca la longitud: "))
anch = float(input("Introduzca la anchura: "))
superficie = longi * anch

print('{0:.5g}'.format(superficie))