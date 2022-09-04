import javax.swing.JOptionPane;
        
public class Exercicio10 {
    
    public static void main(String[] args){
        
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        int soma = num1 + num2;
        
        if(soma > 10){
            JOptionPane.showMessageDialog(null, "Sua soma maior que 10 é: " + soma);
        }
        
    
}
}
