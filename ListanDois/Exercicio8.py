'''
8. Implemente uma função que receba um número inteiro positivo e retorne o fatorial deste número.
'''
def fatorial(n):
    if n < 0:
        return "Não é possível calcular o fatorial de um número negativo."
    elif n == 0 or n == 1:
        return 1
    else:
        resultado = 1
        for i in range(2, n + 1):
            resultado *= i
        return resultado
    
numero = 4
print("o Fatorial do numero informado é " , + fatorial(numero))