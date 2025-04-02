import java.util.ArrayList;
import java.util.List;
public class Questionario {
    private Long id;
    private String nome;
    private List<Dominio> dominios;
    private float pontuacao;

    public Questionario(){
        this.dominios = new ArrayList<Dominio>();
    }
    public Questionario(Long id, String nome){
        this.id = id;
        this.nome = nome;
        this.dominios = new ArrayList<Dominio>();
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

    public List<Dominio> getDominios() {
        return dominios;
    }

    public void setDominios(List<Dominio> dominios) {
        this.dominios = dominios;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }
    // adiciona Dominios na Ativ Part
    public void addDominio(Dominio dominio){
        this.dominios.add(dominio);
        this.calculaPontuacao();
    }
    // calcula a pontuação da Ativ Part
    public void calculaPontuacao(){
        float soma = 0;
        for(Dominio obj : this.dominios){
            soma += obj.getPontuacao();
        }
        this.pontuacao = soma / this.dominios.size();
    }
    @Override
    public String toString() {
        return "Questionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dominios=" + dominios +
                ", pontuacao=" + pontuacao +
                '}';
    }
}
