import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0; 
        int peso = 0;
        int pessoasMais90kg = 0;
        int cont = 0;
        int mediaIdade = 0;
        int somaIdade = 0;

        while (cont < 7){
            System.out.println("Digite a idade: ");
            idade = sc.nextInt();
            
            System.out.println("Digite o peso: ");
            peso = sc.nextInt();

            if (peso > 90){
                pessoasMais90kg++;
            }
            somaIdade = somaIdade+idade;
            mediaIdade = somaIdade/7;

            cont++;
        }
        System.out.println("A quantidade de pessoas com mais de 90kg é "+pessoasMais90kg);
        System.out.println("A média das idades das 7 pessoas é "+mediaIdade);
    }
}
