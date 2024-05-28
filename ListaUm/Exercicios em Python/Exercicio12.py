#12. Escreva um algoritmo que receba a idade, a altura e o peso de 25 pessoas. Calcule e exiba.
# Quantidade de pessoas com idade superior a 50 anos.
# A média das alturas das pessoas com idade entre 10 e 20 anos;
# A porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas.

cont = 0
pesoMenor40Kg = 0
mediaAltura = 0
somaAltura = 0
idadeDezaVinte = 0
idadeMaior50 = 0

while cont < 25:
    idade =  int(input("Digite a idade: "))
    peso =  int(input("Digite o peso: "))
    altura =  float(input("Digite a altura: "))
    cont +=1


    if idade > 50:
        idadeMaior50 +=1

    if peso < 40:
        pesoMenor40Kg +=1

    if idade > 10 and idade < 20:
        idadeDezaVinte +=1

    somaAltura = somaAltura+idade
    mediaAltura = somaAltura/idadeDezaVinte  

print("A quantidade de pessoas com mais de 50 anos é ", idadeMaior50)
print("A média das alturas das 25 pessoas é ", mediaAltura)
print("A porcentagem de pessoas com peso inferior a 40 quilos é ", (pesoMenor40Kg/25)*100)