package exe2;
public class Cliente {
    public int nroAgencia, nroConta; // tipo primitivo
    public String nome; // tipo de classe
    public float saldo; // tipo primitivo
    // método construtor sem parâmetro
    public Cliente(){
        this.nome = "sem nome";
    }
    // método construtor com parâmetros
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo){
            this.nroAgencia = nroAgencia;
            this.nroConta = nroConta;
            this.nome = nome;
            this.saldo = saldo;
    }
    // realizar depósito
    public void depositar(float x){
        this.saldo += x;
        System.out.println("depósito realizado " + x);
    }

    public void exibirDetalhes(){
        System.out.println("Nro. Conta: " + this.nroConta +
                " Nome: " + this.nome +
                " Saldo: " + this.saldo);
    }
    // realizar o saque
    public void sacar(float x){
        if (this.saldo >= x){
            this.saldo -= x;
            System.out.println("Saque realizado");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
}
