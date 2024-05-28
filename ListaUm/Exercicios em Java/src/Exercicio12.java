//12. Escreva um algoritmo que receba a idade, a altura e o peso de 25 pessoas. Calcule e exiba.
//a) Quantidade de pessoas com idade superior a 50 anos.
//b) A média das alturas das pessoas com idade entre 10 e 20 anos;
//c) A porcentagem de pessoas com peso inferior a 40 quilos entre todas as analisadas.

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade = 0; 
        int peso = 0;
        int pessoasMais50 = 0;
        int pesoMenor40 = 0;
        int pesoMenor40Porcentagem = 0;
        int cont = 0;
        Double idadeDezaVinte = 0.0;

        Double altura = 0.0;
        Double mediaAltura = 0.0;
        Double somaAltura = 0.0;

        while (cont < 25){
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            
            System.out.println("Digite o peso: ");
            peso = sc.nextInt();
            
            System.out.println("Digite a altura: ");
            altura = sc.nextDouble();

            if (idade > 50){
                pessoasMais50++;
            }
            if (idade >= 10 && idade <=20){
                idadeDezaVinte ++;
                somaAltura = altura + somaAltura;
            }
            if (peso < 40){
                pesoMenor40++;
            }

            pesoMenor40Porcentagem = (pesoMenor40/25)*100;
            mediaAltura = somaAltura/idadeDezaVinte;
            cont++;
        }
        System.out.println("A quantidade de pessoas com mais de 50 anos é "+pessoasMais50);
        System.out.println(" A média das alturas das pessoas com idade entre 10 e 20 anos é "+mediaAltura);
        System.out.println(" A porcentagem de pessoas com peso inferior a 40 quilos é "+pesoMenor40Porcentagem+"%.");

        
    }


}
