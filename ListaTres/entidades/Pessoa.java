package entidades;

// Exercício 1: Criando uma Classe Simples
// Objetivo: Criar uma classe simples chamada Pessoa com atributos privados e métodos públicos para acessar e modificar esses atributos.
// • Crie uma classe chamada Pessoa.
// • Adicione os atributos privados nome (String) e idade (int).
// • Crie um construtor que inicialize esses atributos.
// • Adicione métodos getNome, setNome, getIdade e setIdade. 

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Exercício 6: Sobrecarga de Construtores
    // Objetivo: Implementar sobrecarga de construtores na classe Pessoa.
    // • Adicione um construtor adicional na classe Pessoa que inicialize apenas o nome.
    // • No construtor que inicializa apenas o nome, defina a idade como 0 por padrão.

    public Pessoa(String nome){
        this.nome = nome;
        idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }    

    // Exercício 2: Criando Métodos na Classe
    // Objetivo: Adicionar métodos na classe Pessoa para exibir informações.
    // • Adicione um método exibirInformacoes na classe Pessoa que exiba o nome e a idade da pessoa.

    public void exibirInformacoes(){
        System.out.printf("Nome: %s\nIdade: %d\n", nome, idade);
    }
}
