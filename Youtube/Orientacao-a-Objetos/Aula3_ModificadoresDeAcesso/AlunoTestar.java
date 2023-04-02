package Youtube.FernandaDev.Aula3_ModificadoresDeAcesso;

public class AlunoTestar {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

//        aluno1.nome = "Thiago";   Quando é private, temos que montar um metodo e usar Set e Get

        aluno1.setNome("Thiago");
//        Para imprimir o nome é necessario fazer um metodo
        System.out.println(aluno1.getNome());

        aluno1.setIdade(25);
        System.out.println(aluno1.getIdade());




    }
}
