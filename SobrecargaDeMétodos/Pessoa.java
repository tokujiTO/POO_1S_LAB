public class Pessoa {
    public int idade;
    public String nome;

    // NÃO EXITSTE A EXPRESSÃO MÉTODO CONSTRUTOR
    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }
    // Spring MVC/Boot
    public Pessoa(){}

    //Nome e dps idade
    public Pessoa(String nome, int idade){
        this(idade, nome);
    }

    //Apenas idade
    public Pessoa(int idade){
        this(idade, null);
        // this.idade = idade;
    }

    //Apenas nome
    public Pessoa(String nome){
        this(nome, 0);
        // this.nome = nome;
    }
}
