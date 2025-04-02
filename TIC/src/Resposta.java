import java.util.Date;
public class Resposta {
    private Long id;
    private Date data;
    // associações são de agregação
    private Candidato candidato;
    private Questionario questionario;
    public Resposta(){
        this.data = new Date();
        this.candidato = new Candidato();
        this.questionario = new Questionario();
    }

    public Resposta(Long id, Date data, Candidato candidato, Questionario questionario) {
        this.id = id;
        this.data = data;
        this.candidato = candidato;
        this.questionario = questionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public Questionario getQuestionario() {
        return questionario;
    }

    public void setQuestionario(Questionario questionario) {
        this.questionario = questionario;
    }

    @Override
    public String toString() {
        return "Resposta{" +
                "id=" + id +
                ", data=" + data +
                ", candidato=" + candidato + // toString()
                ", questionario=" + questionario + // toString()
                '}';
    }
}

