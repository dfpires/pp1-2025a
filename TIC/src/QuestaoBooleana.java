public class QuestaoBooleana extends Questao {
    private boolean logico;
    public QuestaoBooleana(){
        super();
    }
    public QuestaoBooleana(Long id, String nome, boolean logico) {
        super(id, nome);
        this.logico = logico;
    }

    public boolean isLogico() {
        return logico;
    }

    public void setLogico(boolean logico) {
        this.logico = logico;
    }

    @Override
    public String toString() {
        return "\nQuestaoBooleana{" +
                super.toString() +
                "logico=" + logico +
                '}';
    }
    public String mensagem(){
        return "booleano";
    }
}
