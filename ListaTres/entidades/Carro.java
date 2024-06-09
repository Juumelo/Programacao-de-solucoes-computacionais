package entidades;

// Exercício 10: Classe Abstrata
// • Crie as classes Carro e Moto que herdem de Veiculo.
// • Implemente o método mover em ambas as classes, exibindo mensagens apropriadas para cada tipo de veículo.

public class Carro extends Veiculo{

    @Override
    public void mover() {
        System.out.println("O Carro está em movimento.");
    }    
}
