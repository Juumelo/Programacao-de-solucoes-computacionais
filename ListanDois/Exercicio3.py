'''
3. Implemente um programa que receba o total das vendas de cada vendedor e os armazene em um vetor. 
Receba também o percentual de comissão de cada vendedor e armazene-os em um outro vetor. 
Receba os nomes desses vendedores e armazene-os em um terceiro vetor. 
Existem apenas dez vendedores. Calcule e mostre:

- Um relatório com os nomes dos vendedores e os valores a receber;
- O total das vendas de todos os vendedores;
- O maior valor a receber e quem o receberá;
- O menor valor a receber e quem o receberá;
'''
def calcular_valor_a_receber(vendas, comissao):
    return vendas * (comissao / 100)

def obter_dados_vendedor(numero):
    nome = input(f"Digite o nome do vendedor {numero}: ")
    vendas = float(input(f"Digite o total de vendas do vendedor {numero}: "))
    comissao = float(input(f"Digite o percentual de comissão do vendedor {numero} (%): "))
    return nome, vendas, comissao

def calculo():
    nomes = []
    vendas_totais = []
    comissoes = []

    for i in range(1, 11):
        nome, vendas, comissao = obter_dados_vendedor(i)
        nomes.append(nome)
        vendas_totais.append(vendas)
        comissoes.append(comissao)

    valores_a_receber = [calcular_valor_a_receber(v, c) for v, c in zip(vendas_totais, comissoes)]

    print("\nRelatório de Vendedores:")
    for nome, valor in zip(nomes, valores_a_receber):
        print(f"{nome}: R$ {valor:.2f}")

    total_vendas = sum(vendas_totais)
    print(f"\nTotal das vendas de todos os vendedores: R$ {total_vendas:.2f}")

    maior_valor = max(valores_a_receber)
    maior_vendedor = nomes[valores_a_receber.index(maior_valor)]
    print(f"Maior valor a receber: R$ {maior_valor:.2f} (Vendedor: {maior_vendedor})")

    menor_valor = min(valores_a_receber)
    menor_vendedor = nomes[valores_a_receber.index(menor_valor)]
    print(f"Menor valor a receber: R$ {menor_valor:.2f} (Vendedor: {menor_vendedor})")


calculo()
