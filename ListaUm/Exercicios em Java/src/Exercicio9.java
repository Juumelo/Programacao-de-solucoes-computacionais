//9. Escreva um algoritmo que calcule o Fatorial de um número.
//Ex. 5!
//5! = 5 * 4! = 4 * 3! = 3 * 2 ! = 2 * 1! = 1 * 0!
//0! = 1 (por definição)
//5! = 1 * 2 * 3 * 4 * 5

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,fact=1;
    int num=0;

    
    System.out.println("Digite um número: ");
    num = sc.nextInt();

    for(i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println("O Fatorial de "+num+" é: "+fact);
   
    }
        
    


}
