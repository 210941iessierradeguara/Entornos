# Escribe un programa que lea dos variables e intercambie sus contenidos.
x = int(input("El primer valor X= "))
y = int(input("El segundo valor Y= "))

z = x # z es x, x se guarda en z
x = y # x pasa a ser y, x original desaparece
y = z # y pasa a ser z que en verdad es x

print("El valor x es: " + str(x))
print("El valor y es: " + str(y))