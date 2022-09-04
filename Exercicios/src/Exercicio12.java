import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, numero1 + " é maior que " + numero2);
        }else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, numero2 + " é maior que " + numero1);
        }else{
            JOptionPane.showMessageDialog(null, numero1 + " e " + numero2 + " são iguais!");
        }
        
    }
    
}
