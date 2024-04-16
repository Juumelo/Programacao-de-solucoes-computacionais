//10. Escreva um algoritmo que identifique se um número é primo ou não. (Número primo é aquele que é divisível somente por ele e por 1. Exemplo: 7).

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        if((num == 0) || (num == 1)){
            System.out.println("Número válido, mas não é primo. ");
        
        }
        else{
            boolean primo = true;
            for (int i = 2; i <= (num / 2); i++){
              if (num % i == 0) {
                primo = false;
                break;}}

        if(primo){
            System.out.println("O número é primo");
        }
        else{
            System.out.println("O número não é primo");
        }
    }
}}
