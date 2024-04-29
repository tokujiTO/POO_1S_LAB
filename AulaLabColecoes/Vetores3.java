import javax.swing.JOptionPane;
import java.util.Random;

public class Vetores3 {
    public static void main(String[] args) {
        double [] notas = new double[10];
        var gerador = new Random();
        //preencher um vetor
        for(int c = 0; c < notas.length; c++){
            notas[c] = gerador.nextDouble() * 10;
        }
        //exibir um vetor
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        //encontrar a menor nota
        double menor = notas[0];
        for(int i = 1; i < notas.length; i++){
            if(notas[i] < menor){
                menor = notas[i];
            }
        }
        JOptionPane.showMessageDialog(null, String.format("As menor nota foi: %.1f", menor));
        double maior = notas[0];
        for(int c = 1; c < notas.length; c++){
            if(notas[c] > maior){
                maior = notas[c];
            }
        }
        JOptionPane.showMessageDialog(null, String.format("A maior nota foi: %.1f", maior));
        JOptionPane.showMessageDialog(null, String.format("A média foi %.2f", sum(notas)/notas.length));
        double soma;
        for(int c = 0 ; c < notas.length ; c++ ){
            soma += notas[c];
        }
        double media = soma/notas.length;
        JOptionPane.showMessageDialog(null, String.format("A média das notas foi: %.2f", media));
    }
}
