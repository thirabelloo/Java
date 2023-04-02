package Alura.Curso_Java_Entendendo_Orientacao_Objeto.ByteBank;

public class Conta {

    //Atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

//    Criação de métodos


    //Não retorna nada
    public void deposita(double valor) {
//        saldo = saldo + valor;
        this.saldo += valor;

    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(Conta destino, double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;

            destino.deposita(valor);
            return true;
        }
        return false;
    }

}
