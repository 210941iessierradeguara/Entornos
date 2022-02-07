#Escribe un programa que defina una constante que represente el número de meses del año y una variable
#para almacenar un número de mes, inicializado con el valor que desees. El programa debe imprimir por
#pantalla el orden (número) de mes y la porción de año transcurrida.
meses = float(12)
mes = float(8)
percent = mes/meses * 100
txt = "Procentaje transcurrido: {}"

print("Mes " + str(mes) + " de " + str(meses))
print(txt.format(percent))