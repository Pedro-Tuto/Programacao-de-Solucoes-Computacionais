import javax.swing.JOptionPane;

public class Exercicio9 {
    
    public static void main(String[] args){
        
        int peso;
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso (em kg inteiros)"));
        double altura;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        double IMC = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Seu Índice de Massa Corporal é: " + IMC);
        
}
}
