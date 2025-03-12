package exe4;
public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "sem nome";
    }
    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void poluir(){
        if (!this.poluido){
            this.poluido = true;
        }
    }
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
        }
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if (this.nivel >= x){
            this.nivel -= x;
        }
        else {
            System.out.println("Nível do rio não pode ser negativo");
        }
    }
    public String exibeDetalhes() {
        return "Rio {" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + poluido +
                '}';
    }
}
