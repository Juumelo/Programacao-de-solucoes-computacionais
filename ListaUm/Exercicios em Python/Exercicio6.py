#6. Faça um programa que receba dez números, calcule e mostre a soma dos números pares, dos números ímpares e dos divisíveis por 3.
cont = 0
somaPar = 0
divisivelPorTres = 0
somaImpar = 0

while cont < 10:
    num = int(input("Digite um número: "))

    if num % 2 == 0:
        somaPar = num + somaPar
    if num % 3 == 0:
        divisivelPorTres = num + divisivelPorTres
    else:
        somaImpar = num + somaImpar
    cont+=1
print("A soma dos números Pares é ",somaPar)
print("A soma dos números Ímpares é ",somaImpar)
print("A soma dos números divisíveis por 3 é ",divisivelPorTres)