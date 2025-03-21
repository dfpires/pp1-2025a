import exe1.Cliente;

public class MainCliente {
    public static void main(String args[]){
        Cliente obj1 =
new Cliente("452678-9", "9812-3", "Julio", 0);
        obj1.depositar(5000);
        obj1.sacar(2000);
        obj1.sacar(4000);
        System.out.println(obj1.exibeCliente());
    }
}
