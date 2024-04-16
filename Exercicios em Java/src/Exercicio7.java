//7. Faça um programa que exiba todos os números entre 1000 e 2000 que quando divisíveis por 5 produzam resto 3.

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {

        int cont = 1000;

        while (cont < 2000) {
            if (cont % 5 == 3){
                System.out.println(cont);
            }
            cont++;
        }


        
    }


}
