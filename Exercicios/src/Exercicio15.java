import javax.swing.JOptionPane;

public class Exercicio15 {
    
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        
        if(15 <= idade && idade <= 25){
            JOptionPane.showMessageDialog(null, nome + " ACEITA");
        }else{
            JOptionPane.showMessageDialog(null, nome + " NÃO ACEITA");
        }
    }
    
}
