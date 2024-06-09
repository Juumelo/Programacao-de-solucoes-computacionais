package entidades;

// Exercício 8: Polimorfismo com Interfaces
// Objetivo: Demonstrar o polimorfismo usando a interface Trabalhador.
// • Crie uma classe Empresa com um método adicionarTrabalhador que receba um objeto do tipo Trabalhador.
// • No método adicionarTrabalhador, chame o método trabalhar.
// • Crie objetos de Funcionario e Gerente e adicione-os à empresa, demonstrando o polimorfismo.

public class Empresa {    
    public void adicionarTrabalhador(Trabalhador trabalhador){
        trabalhador.trabalhar();
    }
}
