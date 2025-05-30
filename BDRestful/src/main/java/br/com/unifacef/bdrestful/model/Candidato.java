package br.com.unifacef.bdrestful.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;

// este é um exemplo de ORM - Mapeamento objeto relacional
@Entity // classe é uma entidade do banco de dados, vai virar tabela
public class Candidato {
    @Id // chave primária
    // valor será gerado automaticamente quando um candidato for criado
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome, cidade, endereco;
    private Date niver;
    // relação com a classe Formulário
    @ManyToOne
    @JoinColumn(name="formulario_id")
    private Formulario formulario;

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

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Date getNiver() {
        return niver;
    }
    public void setNiver(Date niver) {
        this.niver = niver;
    }
    public Formulario getFormulario() {
        return formulario;
    }
    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }
}
