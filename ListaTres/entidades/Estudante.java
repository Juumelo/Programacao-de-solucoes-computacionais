package entidades;

// Exercício 3: Criando uma Subclasse
// Objetivo: Criar uma subclasse Estudante que herde de Pessoa.
// • Crie uma classe Estudante que herde da classe Pessoa.
// • Adicione um atributo privado curso (String).
// • Crie um construtor que inicialize os atributos da superclasse e o novo atributo curso.
// • Adicione métodos getCurso e setCurso.

public class Estudante extends Pessoa{

    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }
    
    // Exercício 6: Sobrecarga de Construtores
    // • Atualize a classe Estudante para usar o novo construtor de Pessoa, quando necessário.

    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Exercício 4: Sobrescrita de Métodos
    // Objetivo: Sobrescrever métodos na subclasse Estudante.
    // • Sobrescreva o método exibirInformacoes na classe Estudante para exibir também o curso do estudante.

    @Override
    public void exibirInformacoes(){
        System.out.printf("Nome: %s\nIdade: %d\nCurso: %s\n", getNome(), getIdade(), curso);
    }
}
