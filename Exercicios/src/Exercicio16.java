import javax.swing.JOptionPane;

public class Exercicio16 {
    public static void main(String[] args){
        double numero1, numero2, resultado;
        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número:"));
        int controle = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção: \n 1 = ADIÇÃO \n 2 = SUBTRAÇÃO \n 3 = DIVISÃO \n 4 = MULTIPLICAÇÃO"));
              
        switch(controle){
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 3:
                resultado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 4:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            break;
        }
    }
}
