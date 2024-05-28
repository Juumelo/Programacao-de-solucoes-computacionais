#11. Escreva um algoritmo que receba a idade e o peso de sete pessoas. Calcule e exiba a quantidade de pessoas com mais de 90 quilos.
#A média das idades das sete pessoas.
cont = 0
pesoMais90Kg = 0
mediaIdade = 0
somaIdade = 0

while cont < 7:
    idade =  int(input("Digite a idade: "))
    peso =  int(input("Digite o peso: "))
    cont +=1


    if peso > 90:
        pesoMais90Kg +=1

    somaIdade = somaIdade+idade
    mediaIdade = somaIdade/7    

print("A quantidade de pessoas com mais de 90kg é ", pesoMais90Kg)
print("A média das idades das 7 pessoas é ", mediaIdade)