import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args){
    
        int controle, resultado;
        int numero1 = 10;
        int numero2 = 5;
        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual opreção você quer executar?"));
        
        switch(controle){
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            break;
        }
    }
}
