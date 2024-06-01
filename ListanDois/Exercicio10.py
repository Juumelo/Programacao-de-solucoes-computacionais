'''
10. Faça uma função que receba um número inteiro positivo e retorne um valor boleano indicando se o número é primo ou não. 
Um número primo é aquele que é divisível por apenas ele mesmo e um.
'''
def primo(numero):
    if numero <= 1:
        return False  

    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False  

    return True 

