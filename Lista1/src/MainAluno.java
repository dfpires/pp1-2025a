import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        // instancia a classe Aluno -> objeto
        Aluno obj1 = new Aluno(); // chama construtor
        System.out.println("Nome " + obj1.nome + " Média " + obj1.notaFinal());
        Aluno obj2= new Aluno(123, "Tiago", 19, 5.4f, 8.9f);
        System.out.println("Nome " + obj2.nome + " Média " + obj2.notaFinal());


    }
}
