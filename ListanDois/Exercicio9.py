'''
9. Faça uma função que receba como parâmetro o raio de uma esfera, calcule e mostre no programa principal o seu volume, v = 4/3 * R3.
'''

import math

def calculador(raio):
    
    if raio < 0:
        return "O raio deve ser um valor positivo."
    else:
        volume = (4/3) * math.pi * raio**3
        return volume

raio_esfera = 10
volumeEsf = calculador(raio_esfera)
print('O volume da esfera com raio' ,+raio_esfera, 'é aproximadamente' , + (volumeEsf), 'unidades cúbicas.')
