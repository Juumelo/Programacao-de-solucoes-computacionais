//6. Faça um programa que receba dez números, calcule e mostre a soma dos números pares, dos números ímpares e dos divisíveis por 3.

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int cont = 0;
        int somaPar = 0;
        int divisivelPorTres = 0;
        int somaImpar = 0;

        while (cont < 10) {
            System.out.println("Digite um número");
            num = sc.nextInt();
            if (num % 2 == 0){
                somaPar = num + somaPar;
            }
            if (num % 3 == 0){
                divisivelPorTres = num + divisivelPorTres;
            }
            else{
                somaImpar = num + somaImpar;
            }
            cont++;
        }
        System.out.println("A soma dos números Pares é "+somaPar);
        System.out.println("A soma dos números Ímpares é "+somaImpar);
        System.out.println("A soma dos números divisíveis por 3 é "+divisivelPorTres);
        
    }


}
