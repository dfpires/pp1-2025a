//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // cria 2 itens de domínio
        ItemDominio id1 = new ItemDominio(11L, "Ver", 100);
        ItemDominio id2 = new ItemDominio(12L, "Ouvir", 100);
        // cria 1 domínio
        Dominio d1 = new Dominio(1L, "Domínio Sensorial");
        // adiciona os itens de domínio no domínio
        d1.addItemDominio(id1);
        d1.addItemDominio(id2);
      //  System.out.println(d1); // chama toString() de d1

        AtivPart ap1 = new AtivPart(100L, "Atividades e Participações");
        ap1.addDominio(d1);
        // System.out.println(ap1);

        Candidato c1 = new Candidato();
        c1.addAtivPart(ap1);
        System.out.println(c1);

    }
}