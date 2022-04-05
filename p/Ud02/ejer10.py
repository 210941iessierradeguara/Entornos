n = int(input("Introduzca un entero: Introduza un negativo para terminar: "))
minim = 0
maxim = 0

list = []

if n < 0:
    print("El número ha sido negativo.")
    SystemExit(0)

while n >= 0:
    list.append(n)
    n = int(input("Introduzca un entero: Introduza un negativo para terminar. "))

minim = list[0]
maxim = list[0]

for x in list:
    if x > maxim:
        maxim = x
    if x < minim:
        minim = x

print('El número máximo es: ' + str(maxim) + '. El número minimo es: ' + str(minim))