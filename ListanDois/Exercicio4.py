'''
4. Implemente um programa que receba o nome de cinco produtos e seus respectivos preços em dois vetores, calcule e mostre:
- A quantidade de produtos com preço inferior a R$ 50,00
- O nome dos produtos com preço entre R$ 50,00 e R$ 100,00
- A media dos preços dos produtos com preço superior a R$ 100,00.
'''
def obter_dados_produto(numero):
    nome = input(f"Digite o nome do produto {numero}: ")
    preco = float(input(f"Digite o preço do produto {numero} (R$): "))
    return nome, preco

def calc():
    nomes = []
    precos = []

    for i in range(1, 6):
        nome, preco = obter_dados_produto(i)
        nomes.append(nome)
        precos.append(preco)

    qtd_inferior_50 = sum(1 for p in precos if p < 50)
    nomes_entre_50_e_100 = [n for n, p in zip(nomes, precos) if 50 <= p <= 100]
    media_precos_superior_100 = sum(p for p in precos if p > 100) / len(precos) if any(p > 100 for p in precos) else 0

    print(f"Quantidade de produtos com preço inferior a R$ 50,00: {qtd_inferior_50}")
    print(f"Nomes dos produtos com preço entre R$ 50,00 e R$ 100,00: {', '.join(nomes_entre_50_e_100)}")
    print(f"Média dos preços dos produtos com preço superior a R$ 100,00: R$ {media_precos_superior_100:.2f}")

calc()
