import javax.swing.JOptionPane;

public class Exercicio18 {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto:"));
        String categoria = JOptionPane.showInputDialog("Selecione a Categoria do produto: \n A \n B \n C \n D \n E");
        char categoriaCHAR = categoria.charAt(0);
        
        switch(categoriaCHAR){
            case 'A':
                JOptionPane.showMessageDialog(null, nome + ", você pagará " + (0.9*preco));
            break;
            case 'B':
                JOptionPane.showMessageDialog(null, nome + ", você pagará " + (0.85*preco));
            break;
            case 'C':
                JOptionPane.showMessageDialog(null, nome + ", você pagará " + (0.8*preco));
            break;
            case 'D':
                JOptionPane.showMessageDialog(null, nome + ", você pagará " + (0.75*preco));
            break;
            case 'E':
                JOptionPane.showMessageDialog(null, nome + ", você pagará " + (0.5*preco));
            break;
            
            default:
                JOptionPane.showMessageDialog(null, nome + ", por favor selecione uma opção VÁLIDA");
            break;
        }
        
    }
}
