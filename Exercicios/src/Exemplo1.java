import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args){
        
        double numero,metade;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
            
            if(numero > 10){
                metade = numero/2;
                JOptionPane.showMessageDialog(null, "A metade de " + numero + " é:" + metade);
            }
    }
    
}
