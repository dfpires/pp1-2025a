import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // cria 2 itens de domínio
        QuestaoNumerica id1 = new QuestaoNumerica(11L, "Ver", 100);
        QuestaoNumerica id2 = new QuestaoNumerica(12L, "Ouvir", 100);
        // cria 1 domínio
        Dominio d1 = new Dominio(1L, "Domínio Sensorial");
        // adiciona os itens de domínio no domínio
        d1.addQuestaoNumerica(id1);
        d1.addQuestaoNumerica(id2);
      //  System.out.println(d1); // chama toString() de d1

        Questionario ap1 = new Questionario(100L, "Atividades e Participações");
        ap1.addDominio(d1);
        // System.out.println(ap1);

        Candidato c1 = new Candidato(3L, "Diego", "123", "Rua Luzia", "Centro",
                "Franca", new Date());
        Resposta r1 = new Resposta(10L, new Date(), c1, ap1);
        System.out.println(r1);

    }
}