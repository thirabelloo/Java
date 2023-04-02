package Alura.Curso_Java_Entendendo_Orientacao_Objeto.ByteBank;

public class TestaMetodos {

    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100;

//        Criação do métodos
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

//      Imprimir true ou false
        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela =new Conta();
        contaDaMarcela.deposita(1000);
        contaDaMarcela.transfere(contaDoPaulo,300);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoPaulo.saldo);

        contaDoPaulo.titular = "Paulo Silveira";
        System.out.println(contaDoPaulo.titular);

    }
}
