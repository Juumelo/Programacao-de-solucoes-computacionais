package entidades;

// Exercício 10: Classe Abstrata
// Objetivo: Criar uma classe abstrata Veiculo e derivar subclasses Carro e Moto.
// • Crie uma classe abstrata Veiculo com um método abstrato mover.
// • Crie as classes Carro e Moto que herdem de Veiculo.
// • Implemente o método mover em ambas as classes, exibindo mensagens apropriadas para cada tipo de veículo.
// • Crie uma lista de objetos do tipo Veiculo e adicione objetos Carro e Moto na lista.
// • Itere sobre a lista e chame o método mover para cada objeto, demonstrando o polimorfismo.

public abstract class Veiculo {
    public abstract void mover();
}
