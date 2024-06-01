'''
7. Faça uma função que receba três números inteiro como parâmetros, 
representando horas, minutos e segundos e os converta em segundos. 
Exemplo 2h, 40min e 10 seg. correspondem a 9.610 segundos.
'''

def conversor(horas, minutos, segundos):
 
    totalSeg = horas * 3600 + minutos * 60 + segundos
    return totalSeg

horasEx = 2
minEx = 40
segEx = 10

totalSegEx = conversor(horasEx, minEx, segEx)

print(f"{horasEx}h, {minEx}min e {segEx} seg correspondem a {totalSegEx} segundos.")
