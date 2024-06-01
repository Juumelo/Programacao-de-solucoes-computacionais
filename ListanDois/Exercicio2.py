'''
2. Implemente um programa que carregue um vetor com 15 elementos inteiros e verifique a existência de elementos iguais a 30,
mostrando as posições em que esses elementos apareceram.
''' 
def encontrar_posicoes_do_elemento(vetor):
    posicoes = []
    for i, elemento in enumerate(vetor):
        if elemento == 30:
            posicoes.append(i+1)
    return posicoes

entrada = input("Digite 15 números inteiros separados por espaços: ")
numeros = list(map(int, entrada.split()))

posicoes_iguais_a_30 = encontrar_posicoes_do_elemento(numeros)


if posicoes_iguais_a_30:
    print(f"Elemento 30 encontrado nas posições: {posicoes_iguais_a_30}")
else:
    print("Nenhum elemento igual a 30 encontrado na lista.")