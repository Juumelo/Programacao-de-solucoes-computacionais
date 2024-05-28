#9. Escreva um algoritmo que calcule o Fatorial de um número.
#Ex. 5!
#5! = 5 * 4! = 4 * 3! = 3 * 2 ! = 2 * 1! = 1 * 0!
#0! = 1 (por definição)
#5! = 1 * 2 * 3 * 4 * 5


numero = int(input("Insira um número: ") )

resultado=1
count=1

while count <= numero:
    resultado *= count
    count += 1

print("O fatorial de ",numero," é ",resultado)