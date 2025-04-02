public class QuestaoNumerica {
    private Long id;
    private String nome;
    private int numero;

    public QuestaoNumerica() {
    }

    public QuestaoNumerica(Long id, String nome, int numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int pontuacao) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nQuestaoNumerica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
