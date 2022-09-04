import javax.swing.JOptionPane;
        
public class Exercicio17 {
    public static void main(String[] args){
        String profissao = JOptionPane.showInputDialog("Digite a profissão do Tibúrcio, opções: \n Engenheiro \n Médico \n Designer \n Programador \n Advogado");
        char profissaoCHAR = profissao.charAt(0);
        
            switch(profissaoCHAR){
                case 'E':
                    JOptionPane.showMessageDialog(null, "O Tibúrcio é ENGENHEIRO!");
                break;
                case 'M':
                    JOptionPane.showMessageDialog(null, "O Tibúrcio é MÉDICO");
                break;
                case 'D':
                    JOptionPane.showMessageDialog(null, "O Tibúrcio é DESIGNER!");
                break;
                case 'P':
                    JOptionPane.showMessageDialog(null, "O Tibúrcio é PROGRAMADOR!");
                break;
                case 'A':
                    JOptionPane.showMessageDialog(null, "O Tibúrcio é ADVOGADO!");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "O Tibpurcio é DESEMPREGADO!");
                break;
                
            }
    }
    
}
