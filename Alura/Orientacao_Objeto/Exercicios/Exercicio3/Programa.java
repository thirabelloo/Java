package Alura.Curso_Java_Entendendo_Orientacao_Objeto.Exercicios.Exercicio3;

public class Programa {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.cpf = "222.222-22";
        p.endereco = new Endereco();

        p.endereco.logradouro = "Avenidade XYZ";
        System.out.println(p.endereco.logradouro);

    }
}
