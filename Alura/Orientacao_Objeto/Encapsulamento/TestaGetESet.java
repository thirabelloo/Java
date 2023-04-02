package Alura.Curso_Java_Entendendo_Orientacao_Objeto.Encapsulamento;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);

//        Atribuir valores Set
//        conta.setNumero(1337);
//        Imprimir usa o Get
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        paulo.setNome("Paulinho");

        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
//       agora em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");

    }
}
