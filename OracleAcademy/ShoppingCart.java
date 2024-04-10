import javax.swing.JOptionPane;
public class ShoppingCart{
    public static void main(String[] args) {
        String custName = JOptionPane.showInputDialog("Digite seu nome: ");
        int spaceIdx = custName.indexOf(" ");
        String firstName = custName.substring(0, spaceIdx);
        System.out.println(firstName);
    }
}
