import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double area, comprimento, largura;

        comprimento = Double.parseDouble(JOptionPane.showInputDialog("escreva o comprimento"));
        largura = Double.parseDouble(JOptionPane.showInputDialog("escreva a largura"));

        area = largura * comprimento;

        JOptionPane.showMessageDialog(null, "A área é: " + area);


    }
}