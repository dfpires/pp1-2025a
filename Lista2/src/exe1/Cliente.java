package exe1;
public class Cliente {
    private String nroConta, nroAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nroConta = "111111-1";
        this.nroAgencia = "1111-1";
        this.nome = "sem nome";
    }

    public Cliente(String nroConta, String nroAgencia, String nome, float saldo) {
        this.setNroConta(nroConta);
        this.nroAgencia = nroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNroConta() {
        return nroConta;
    }

    public void setNroConta(String nroConta) {
        // método de instância - trabalha com o objeto - length() e charAt()
        if (nroConta.length() == 8){
            if (nroConta.charAt(6) == '-'){
                this.nroConta = nroConta;
            }
            else {
                System.out.println("Problema no DV da conta");
                this.nroConta = "111111-1";
            }
        }
        else {
            System.out.println("Problema no tamanho da conta");
            this.nroConta = "111111-1";
        }

    }

    public String getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(String nroAgencia) {
        if (nroAgencia.length() == 6) {
            if (nroAgencia.charAt(4) == '-'){
                this.nroAgencia = nroAgencia;
            }
            else {
                System.out.println("Problema no DV da agência");
                this.nroAgencia = "1111-1";
            }
        }
        else {
            System.out.println("Problema no tamanho da agência");
            this.nroAgencia = "1111-1";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else {
            System.out.println("Problema no tamanho do nome");
            this.nome = "sem nome";
        }
    }
    public void setSaldo(float saldo) {
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
    public float getSaldo() {
        return saldo;
    }
}
