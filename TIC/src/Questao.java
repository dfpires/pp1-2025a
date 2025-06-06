public abstract class Questao {
    protected Long id;
    protected String nome;

    public Questao() {
        this.nome = "sem nome";
    }

    public Questao(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Questao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
    public abstract String mensagem();
}
