import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import java.util.Random;
import static java.lang.Integer.parseInt;

public class RockPaperScissors{

    public static void main(String[] args){
        int escolha = parseInt(showInputDialog("Digite uma opção:\n [0] Pedra\n [1] Papel\n [2] Tesoura"));
        Random rndint = new Random();
        int computador = rndint.nextInt(3);
        if(escolha == 0){
            if(computador == 0){
                showMessageDialog(null, "O computador escolheu pedra, EMPATE");
            }else if(computador == 1){
                showMessageDialog(null, "O computador escolheu papel, DERROTA");
            }else{
                showMessageDialog(null, "O computador escolheu tesoura, VITÓRIA");
            }
        } else if(escolha == 1){
            if(computador == 0){
                showMessageDialog(null, "O computador escolheu pedra, VITÓRIA");
            }else if(computador == 1){
                showMessageDialog(null, "O computador escolheu papel, EMPATE");
            }else{
                showMessageDialog(null, "O computador escolheu tesoura, DERROTA");
            }
        } else {
            if(computador == 0){
                showMessageDialog(null, "O computador escolheu pedra, DERROTA");
            }else if(computador == 1){
                showMessageDialog(null, "O computador escolheu papel, VITÓRIA");
            }else{
                showMessageDialog(null, "O computador escolheu tesoura, EMPATE");
            }
        }

    }
}