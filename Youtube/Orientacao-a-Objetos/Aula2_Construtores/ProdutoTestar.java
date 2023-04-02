package Youtube.FernandaDev.Aula2_Construtores;

public class ProdutoTestar {

    public static void main(String[] args) {

//        Construtor padrão:
        Produto produto1 = new Produto();
        produto1.nome = "Caneta Preta";
        produto1.marca = "Bic";
        produto1.valor = 1.50f;

//        Construtor de dois parâmetros
        Produto produto2 = new Produto("Caneta vermelha", "Faber");
        produto2.valor = 1.69f;

//        Construtor de três parâmetros
        Produto produto3 = new Produto("Borracha", "mercur", 1.89f);

//        Objeto produto1
        System.out.println("Nome: " + produto1.nome + " Marca: "+ produto1.marca + " valor: " +produto1.valor);

//                Objeto produto2
        System.out.println("Nome: " + produto2.nome + " Marca: "+ produto2.marca + " valor: " +produto2.valor);

//                Objeto produto3
        System.out.println("Nome: " + produto3.nome + " Marca: "+ produto3.marca + " valor: " +produto3.valor);






    }
}
