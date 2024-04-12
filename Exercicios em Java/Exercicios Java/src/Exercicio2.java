import java.util.Scanner;
import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double numero = 0.0;
        Double numeroMaior = 0.0;
        int cont = 0;


        for (cont = 0; cont < 5; cont++) {
            System.out.println("Digite um número de ponto flutuante: ");
            numero = sc.nextDouble();
            if (numero>numeroMaior){
                numeroMaior = numero;
            }
        };
        System.out.println("O maior numero é: " +numeroMaior);
    }
}
