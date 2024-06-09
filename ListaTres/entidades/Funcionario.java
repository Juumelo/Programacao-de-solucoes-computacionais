package entidades;

// Exercício 5: Criando uma Classe com Atributos Protegidos
// Objetivo: Criar uma classe Funcionario com atributos protegidos e derivar uma subclasse Gerente.
// • Crie uma classe Funcionario com atributos protegidos salario (double) e departamento (String).
// • Adicione um método exibirInformacoes na classe Funcionario para exibir as informações.

public class Funcionario implements Trabalhador{
    protected double salario;
    protected String departamento;

    public void exibirInformacoes(){
        System.out.printf("Departamento: %s\nSalario: R$ %.2f\n", departamento, salario);
    }

// Exercício 7: Trabalhando com Interfaces
// • Implemente a interface Trabalhador na classe Funcionario.
// • Na implementação do método trabalhar, exiba uma mensagem indicando que o funcionário está trabalhando.

    @Override
    public void trabalhar() {
        System.out.println("Funcionário em horario de trabalho.");
    }
}
