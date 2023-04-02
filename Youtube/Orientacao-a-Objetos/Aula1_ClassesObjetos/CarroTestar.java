package Youtube.FernandaDev.Aula1_ClassesObjetos;

public class CarroTestar {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.nome = "Uno";
        carro.marca = "Fiat";
        carro.ano = 2015;
        carro.velocidade = 60;

        carro.acelerar(10);
        System.out.println("Velocidade: " + carro.velocidade + "km/h");


        carro.freiar(30);
        System.out.println("Velocidade de freagem: " + carro.velocidade + "km/h");
    }
}
