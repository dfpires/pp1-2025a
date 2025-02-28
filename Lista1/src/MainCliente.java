import exe2.Cliente;

public class MainCliente {
    public static void main(String args[]) {
        Cliente obj1 = new Cliente();
        obj1.depositar(1000);
        obj1.sacar(300);
        obj1.exibirDetalhes();

        Cliente obj2 = new Cliente(123, 456, "Julio", 3000.0f);
        obj2.depositar(1500);
        obj2.sacar(5000);
        obj2.exibirDetalhes();

    }
}
