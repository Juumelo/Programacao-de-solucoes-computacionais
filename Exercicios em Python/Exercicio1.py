#1. Implemente um programa que solicite 10 números inteiros informados pelo usuário. Exiba a soma.
soma = 0
cont = 0
while  cont < 10:
    cont+=1
    num = input ("Insira um número: ")
    numInt = int(num)
    soma = numInt + soma

print("A soma dos números digitados é ", soma)