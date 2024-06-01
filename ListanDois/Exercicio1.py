'''
1. Implemente um programa que carregue um vetor de seis elementos numéricos inteiros, calcule e mostre:
º A quantidade de números pares;
º Quais os números pares;
º A quantidade de números impares
º Quais os números impares.
'''
vetNum = [2, 3, 6, 7, 10, 15]

pares = []

impares = []

for numero in vetNum:

   if numero % 2 == 0:

       pares.append(numero)

   else:

       impares.append(numero)

print("Números pares:", pares)
print("Quantidade de números pares:", len(pares))

print("Números ímpares:", impares)
print("Quantidade de números ímpares:", len(impares))