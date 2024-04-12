import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        int pares = 0;

        while (cont < 10) {
            System.out.println("Digite um número: ");
            num = sc.nextInt();
            if (num % 2  == 0 ){
                pares++;
            }
            cont++;
       }
       System.out.println(pares+" números são pares.");
    }
}