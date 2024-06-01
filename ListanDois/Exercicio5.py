'''
5. Implemente um programa que leia um vetor de 15 posições com números inteiros. 
Crie em seguida um vetor resultante (máximo 15 posições) que contenha apenas os números primos do primeiro vetor. 
Escreva o vetor resultante. Para este exercício utilize a função de calcular primo implementada na lista 3.
'''
def numPrimo(numero):
    if numero <= 1:
        return False
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False
    return True

def filtrar_primos(vetor):
    return [num for num in vetor if numPrimo(num)]

def main():
    vetor = []
    for i in range(15):
        numero = int(input(f"Digite o {i + 1}º número inteiro: "))
        vetor.append(numero)

    primos = filtrar_primos(vetor)

    print("Números primos encontrados:")
    for primo in primos:
        print(primo)

main()
