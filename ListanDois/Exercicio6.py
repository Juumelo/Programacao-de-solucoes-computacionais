'''
6. Faça uma função que receba um número inteiro e positivo N como parâmetro e retorne a soma dos N números inteiros existentes
entre o número 1 e esse número.
'''
def somaInteiro(N):
    if N <= 0:
        return 0
    return N * (N + 1) // 2

numero_N = int(input("Digite um número inteiro e positivo N: "))
resultado = somaInteiro(numero_N)
print("A soma dos" + numero_N + "primeiros números inteiros é:" + resultado)
