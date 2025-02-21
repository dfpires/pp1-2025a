import javax.swing.*;

public class Carro {
    // variáveis
    // tipo de dados primitivo
    public int ano;
    public float velocidade;
    // tipo de dado é uma classe
    public String marca, modelo;
    // métodos construtores
    // sem parâmetro
    public Carro(){
        this.marca = "Vazia";
        this.modelo = "Vazio";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    // métodos
    public void exibirDetalhes(){
        // this representa o objeto que chama o método
        JOptionPane.showMessageDialog(null,
                "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade);
    }

    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    public void frear(float x){
        if (this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else {
            System.out.println("Freagem não ocorreu");
        }
    }
}
