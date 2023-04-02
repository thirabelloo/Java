package Alura.Curso_Java_Entendendo_Orientacao_Objeto.Exercicios.Exercicio4;

public class Programa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.endereco.logradouro = "Avenida XYZ";

        System.out.println(p.endereco.logradouro);

    }
}
