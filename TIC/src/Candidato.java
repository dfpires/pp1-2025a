import java.util.ArrayList;
import java.util.Date;

public class Candidato {
    private Long id;
    private String nome, telefone, endereco, bairro, cidade;
    private Date data;
    // associação
    private AtivPart ativPar;

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", data=" + data +
                ", ativPar=" + ativPar +
                '}';
    }

    public void addAtivPart(AtivPart ap){
        this.ativPar = ap;
    }
}
