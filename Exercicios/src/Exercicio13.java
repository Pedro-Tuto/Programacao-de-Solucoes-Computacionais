import javax.swing.JOptionPane;

public class Exercicio13 {
    
    public static void main(String[] args){
        
        double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto: "));
        double prestacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação:"));
        if(prestacao <= 30%salarioBruto){
            JOptionPane.showMessageDialog(null, "O empréstimo pode ser concedido.");
        }else{
            JOptionPane.showMessageDialog(null, "O empréstimo não pode ser concedido.");
        }
    }
    
}
