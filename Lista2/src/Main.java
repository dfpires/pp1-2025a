import exe0.Carro;

public class Main {
    public static void main(String[] args) {
        Carro obj1 = new Carro();
        //obj1.marca = "Fiat";
        obj1.setMarca("Volkswagen");
        obj1.setModelo("Polo");
        //obj1.velocidade = -30;
        obj1.setVelocidade(-30);
        obj1.setAno(-2022);
        //System.out.println("Ano: " + obj1.ano);
        System.out.println("Ano: " + obj1.getAno());

        // objeto usando parâmetros
        Carro obj2 = new Carro("Chevrolet", "Onix", -2021, -30);
       // obj2.verificaVelMaxima();
    }
}