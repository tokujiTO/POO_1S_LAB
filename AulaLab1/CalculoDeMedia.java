import javax.swing.JOptionPane;

public class CalculoDeMedia {              // main class
    public static void main(String[] args) {            // main method
        
        // variáveis

        double PrimeiraNota, SegundaNota, TerceiraNota, Resultado;
    
        // entrada

        PrimeiraNota = Double.parseDouble(JOptionPane.showInputDialog("Coloque a primeira nota"));
        SegundaNota = Double.parseDouble(JOptionPane.showInputDialog("Coloque a segunda nota"));
        TerceiraNota = Double.parseDouble(JOptionPane.showInputDialog("Coloque a terceira nota"));

        // processo

        Resultado = ( PrimeiraNota + SegundaNota + TerceiraNota ) / 3;

        //saída
        
        if (Resultado >= 6 && Resultado <= 10) {
            JOptionPane.showMessageDialog(null, Resultado, "Você passou!", 1 );
        }

        else if (Resultado < 6 && Resultado >= 0){
            JOptionPane.showMessageDialog(null, Resultado, "Você reprovou", 2);
        };

        if (Resultado > 10) {
            JOptionPane.showMessageDialog(null, Resultado, "Erro no cálculo, valor inválido", 2);
        };

        if (Resultado < 0) {
            JOptionPane.showMessageDialog(null, Resultado, "Erro no cálculo, valor inválido", 2);
        }
    }
}
