package exe2;
public class Aluno {
    private int nroAluno, idade;
    private String nome;
    private float p1, p2;
    public Aluno() {
    }
    public Aluno(int nroAluno, int idade, String nome, float p1, float p2) {
        this.setNroAluno(nroAluno);
        this.idade = idade;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public int getNroAluno() {
        return nroAluno;
    }

    public void setNroAluno(int nroAluno) {
        // método de classe - chamado por uma classe
        String auxiliar = String.valueOf(nroAluno);
        if (auxiliar.length() == 6){
            this.nroAluno = nroAluno;
        }
        else {
            System.out.println("Problema no tamanho do nro do aluno");
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0){
            this.idade = idade;
        }
        else System.out.println("Idade inválida");
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("tamanho inválido para nome");
    }

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    public String exibeAluno() {
        return "Aluno{" +
                "nroAluno=" + nroAluno +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
