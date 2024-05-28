//8. Implemente um programa que solicite ao usuário um número. Exiba a tabuada de 0 a 100 deste número.

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cont = 0;

        System.out.println("Informe um número: ");
        num = sc.nextInt();
        
        System.out.println("A tabuada do "+num+" é:");

        while(cont <= 100){
            System.out.println(num +" x " + cont + " = " + num*cont);
            cont++;
        }
        
    }


}
