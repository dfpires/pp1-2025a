import java.util.ArrayList;
import java.util.Date;

public class Candidato {
    private Long id;
    private String nome, telefone, endereco, bairro, cidade;
    private Date niver;

    public Candidato() {
    }
    public Candidato(Long id, String nome, String telefone, String endereco, String bairro, String cidade, Date niver) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.niver = niver;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getNiver() {
        return niver;
    }

    public void setNiver(Date niver) {
        this.niver = niver;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", niver=" + niver +
             '}';
    }



}
