package entidades;

// Exercício 5: Criando uma Classe com Atributos Protegidos
// • Crie uma subclasse Gerente que herde de Funcionario.
// • Adicione um atributo privado bonus (double) na classe Gerente.
// • Crie um construtor que inicialize os atributos de Funcionario e Gerente.

public class Gerente extends Funcionario implements Trabalhador{
    private double bonus;

    public Gerente(double salario, String departamento, double bonus) {
        this.salario = salario;
        this.departamento = departamento;        
        this.bonus = bonus;
    }    

// Exercício 7: Trabalhando com Interfaces
// • Atualize a classe Gerente para também implementar a interface Trabalhador.

    @Override
    public void trabalhar() {
        System.out.println("Gerente em horario de trabalho.");
    }
}
