#8. Implemente um programa que solicite ao usuário um número. Exiba a tabuada de 0 a 100 deste número.

cont = 0

num = int(input("Informe um número: "))
print("A tabuada do ",num," é:");

while cont <= 100:
    print(num ," x ", cont , " = " , num*cont);
    cont +=1