package exe0;

public class Carro {
    // private - encapsulamento de variáveis
    private String marca, modelo;
    private int ano;
    private float velocidade;
    public Carro(){
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }
    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }
    // setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setVelocidade(float velocidade){
        if (velocidade >= 0){
            this.velocidade = velocidade;
        }
        else {
            System.out.println("velocidade inválida");
        }
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setAno(int ano){
        if (ano >= 0){
            this.ano = ano;
        }
        else {
            System.out.println("ano inválido");
        }
    }
    // getters
    public int getAno(){
        return this.ano;
    }
    public float getVelocidade(){
        return this.velocidade;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }

    public String exibeCarro() {
        return "Carro{" +
                "marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", ano=" + this.ano +
                ", velocidade=" + this.velocidade +
                '}';
    }
    public void acelerar(float x){
        this.setVelocidade(this.velocidade + x);
        this.verificaVelMaxima();
    }
    // frear o carro de x unidades
    public void frear(float x){
        this.setVelocidade(this.velocidade - x);
    }
    private void verificaVelMaxima(){
        if (this.velocidade > 200){
            this.velocidade = 200;
        }
    }

}
