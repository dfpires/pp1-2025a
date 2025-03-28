import java.util.ArrayList;
import java.util.List;
public class Dominio {
    private Long id;
    private String nome;
    // associação
    private List<ItemDominio> itens;
    private int pontuacao;
    public Dominio(){
        // aloca espaço na memória para o vetor
        itens = new ArrayList<ItemDominio>();
    }
    public Dominio(Long id, String nome){
        this.id = id;
        this.nome = nome;
        // aloca espaço na memória para o vetor
        itens = new ArrayList<ItemDominio>();
    }

}
