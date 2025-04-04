public class QuestaoNumerica extends Questao{
    private int numero;

    public QuestaoNumerica() {
        super(); // chama construtor da superclasse
    }

    public QuestaoNumerica(Long id, String nome, int numero) {
        super(id, nome); // chama construtor da superclasse
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override // anulação de método herdado
    public String toString() {
        return "\nQuestaoNumerica{" +
               super.toString() +
                ", numero=" + numero +
                '}';
    }
}
