# Escribe un programa que lea del teclado un tiempo transcurrido en segundos y muestre por pantalla las
# horas, minutos y segundos equivalentes.
secs = int(input("Introduzca los segundos: "))
mins = secs/60
hors = mins/60
dias = hors/24

print(str(secs) + " segundos son " + str(mins) + " en minutos, " + str(hors) + " en horas y " + str(dias) + " en días")