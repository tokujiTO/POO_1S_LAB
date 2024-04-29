import javax.swing.JOptionPane;

public class Vetores {
    public static void main(String[] args) {
        double [] meuVetor = new double[Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos vc quer?"))];
        System.out.println(meuVetor.length);
    }
}