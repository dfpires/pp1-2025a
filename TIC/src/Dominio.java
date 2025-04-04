import java.util.ArrayList;
import java.util.List;
public class Dominio {
    private Long id;
    private String nome;
    // associação
    private List<Questao> itens;
    private float pontuacao;
    public Dominio(){
        // aloca espaço na memória para o vetor
        itens = new ArrayList<Questao>();
    }
    public Dominio(Long id, String nome){
        this.id = id;
        this.nome = nome;
        // aloca espaço na memória para o vetor
        itens = new ArrayList<Questao>();
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

    public List<Questao> getItens() {
        return itens;
    }

    public void setItens(List<Questao> itens) {
        this.itens = itens;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    // adiciona ItemDominio no vetor
    public void addQuestao(Questao itemDominio){
        this.itens.add(itemDominio);
        calculaPontuacao();
    }
    // calcula a pontuação do domínio
    public void calculaPontuacao(){
        int soma = 0;
       for( Questao obj: this.itens){ // para cada item de domínio
         //  soma += obj.getNumero(); // soma a pontuação
       }
       this.pontuacao = (float) soma / this.itens.size();
    }

    @Override
    public String toString() {
        return "\nDominio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", itens=" + itens +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
