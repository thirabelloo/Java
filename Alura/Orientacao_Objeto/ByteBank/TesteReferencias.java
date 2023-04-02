package Alura.Curso_Java_Entendendo_Orientacao_Objeto.ByteBank;

public class TesteReferencias {

    public static void main(String[] args) {

//        primieraConta -> é uma referência
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("saldo da primeira conta " + primeiraConta.saldo);


        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda conta " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda conta " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesmissima conta");
        }
//        Referencia para uma conta
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
