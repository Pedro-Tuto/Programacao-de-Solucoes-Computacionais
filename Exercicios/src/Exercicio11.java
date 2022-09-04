import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        if (numero % 2 == 0){
            JOptionPane.showMessageDialog(null, numero + " é divisível por 2!");           
        } else{
            JOptionPane.showMessageDialog(null, numero + "não é divisível por 2.");
        }

    }
    
}
