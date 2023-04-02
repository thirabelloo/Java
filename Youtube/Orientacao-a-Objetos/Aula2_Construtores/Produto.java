package Youtube.FernandaDev.Aula2_Construtores;

public class Produto {

//    Atributos

    String nome;
    String marca;
    float valor;

    //Construtores

    Produto() {

    }

    Produto(String nome) {
        this.nome = nome;

    }

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor){
        this.nome = nome;
        this. marca = marca;
        this.valor = valor;
    }
}
