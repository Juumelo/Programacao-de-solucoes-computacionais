'''
11. Faça uma função que receba por parâmetro um valor inteiro positivo N e retorne o valor de S.
S = 1 1/1! + 1/2! + 1/3! + 1/4! + 1 / N!
'''
import math

def calcular(N):
    
    if N <= 0:
        return "O valor de N deve ser um número inteiro positivo."

    soma = 0
    for i in range(1, N + 1):
        fatorial_i = math.factorial(i)
        soma += 1 / fatorial_i

    return soma
