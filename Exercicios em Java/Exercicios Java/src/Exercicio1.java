import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int numero = 0;
        int cont = 0;
        int soma = 0;

        while (cont < 10 ){
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            soma = numero+soma;
            cont++;
        }
        System.out.println("O resultado da soma dos numeros é "+soma);
    }
}
