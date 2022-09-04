import javax.swing.JOptionPane;

public class Exercicio14 {
    
    public static void main(String[] args){
        
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));
        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        int idade = anoAtual - anoNascimento;
        if(anoNascimento < anoAtual){
            JOptionPane.showMessageDialog(null, "Sua idade é " + idade);
        }else{
            JOptionPane.showMessageDialog(null, "Seu ano de nascimento não é válido.");
        }
    }
    
}
