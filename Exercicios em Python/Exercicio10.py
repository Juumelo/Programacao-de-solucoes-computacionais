#10. Escreva um algoritmo que identifique se um número é primo ou não. (Número primo é aquele que é divisível somente por ele e por 1. Exemplo: 7).

numero = int(input("Digite um número: "))
if numero >= 1:
    for i in range(2, numero):
        if numero % i == 0:
            print(numero, 'não é primo')
            break
        else:
            print(numero, 'é primo')
