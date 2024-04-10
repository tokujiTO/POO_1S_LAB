package AulaLab3;
import java.util.Random;

public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var dado = new Random();
        var personagem = new Personagem();
        personagem.nome = "Alex";
        int pontuacao = 0;
        // loop infinito
        // a cada iteração, sortear se o personagem caça, dorme ou come
        // depois de cada ação, vamos exivir o estado atual do personagem
        // nível fácil: sempre que o personagem caça, ele ganha mais um ponto de energia
        // 0: caçar (também ganha mais um ponto de energia)
        // 1: comer
        // 2: dormir
        // faça o personagem morrer: energia = 0, fome = 0 ou sono = 0
        // A cada atividade, personagem ganha 1 ponto
        boolean condicao = true;
        while (condicao) {
            var oQueFazer = 1 + dado.nextInt(3);
            switch (oQueFazer) {
                case 1:
                    personagem.cacar();
                    personagem.setEnergia(personagem.getEnergia() + 1);
                    break;
                case 2:
                    personagem.comer();
                    break;
                case 3:
                    personagem.dormir();
                    break;
            }
            System.out.println(personagem);
            System.out.println("******************************************************");
            Thread.sleep(2000);
            if (personagem.getSono() == 10 || personagem.getEnergia() == 0 || personagem.getFome() == 10) {
                condicao = false;
                pontuacao -= 1;
            }
            pontuacao += 1;
        }
        System.out.println("O personagem morreu!");
        System.out.printf("Sua pontuação final doi: %d", pontuacao);
    }
}
