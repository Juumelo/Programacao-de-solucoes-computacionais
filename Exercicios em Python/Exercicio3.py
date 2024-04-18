#3. Implemente um programa que solicite 10 números inteiros ao usuário. Informe quantos números são pares.
pares = 0
cont = 0

while cont < 10:
    num = input("Informe um número: ")
    numInt = int(num)
    cont +=1
    if numInt % 2 == 0:
        pares += 1 
    
print("Foram informados ",pares, " numeros pares.")