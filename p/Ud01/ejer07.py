# Escribe un programa que lea del teclado un número real de grados Fahrenheit y lo convierta a Celsius
# mostrando el resultado en la pantalla. La fórmula para pasar a grados Celsius es: oC = 5/9 x (oF ‐ 32) ( 1 farenheit = -17.22 celsius)
NumFar = int(input("Introduzca el valor en Farenheit: "))
celsiVuelt = (NumFar-30)/2
print("En Celsius la cantidad " + str(NumFar) + " Farenheit. Se corresponde a: " + str(celsiVuelt) + " Grados celsius.")