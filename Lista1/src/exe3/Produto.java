package exe3;
public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    // criar um objeto produto sem valores
    public Produto(){
        this.descricao = "sem descrição";
    }
    // criar um objeto produto com valores
    public Produto(int id, int qtde, String descricao, float preco){
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }
    // comprar x unidades
    public void comprar(int x){
        this.qtde += x;
    }
    // subir preço em x unidades
    public void subir(float x){
        this.preco += x;
    }
    // vender x unidades
    public void vender(int x){
        if (this.qtde >= x){
            this.qtde -=x;
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }
    // diminuir preço da bola
    public void diminuir(float x){
        if (this.preco >= x){
            this.preco -= x;
        }
        else {
            System.out.println("Preço não pode ser negativo");
        }
    }
    public String exibeDetalhes() {
        return "Produto{" +
                "id=" + this.id +
                ", qtde=" + this.qtde +
                ", descricao='" + this.descricao + '\'' +
                ", preco=" + this.preco +
                '}';
    }
}
