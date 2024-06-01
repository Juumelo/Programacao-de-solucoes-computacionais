'''
12. Faça uma função que retorne o último nome de uma pessoa passado como argumento dessa função.
'''
def ultimo_nome(nome_completo):
    parte_do_nome = nome_completo.split()
    if len(parte_do_nome) > 1:
        return parte_do_nome[-1]
    else:
        return "Não foi possível determinar o último nome."
