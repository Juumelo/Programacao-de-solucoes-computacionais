#2. Implemente um programa que solicite 5 números do tipo ponto flutuante ao usuário. Exiba o maior número informado.
numMaior = 0
cont = 0
while cont < 5:
    cont +=1
    num = input("Informe um número de ponto flutuante: ")
    numFloat = float(num)

    if numFloat > numMaior:
        numMaior = numFloat
print("O maior número informado foi: ", numMaior)