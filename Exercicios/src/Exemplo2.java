import javax.swing.JOptionPane;
        
public class Exemplo2 {
    public static void main(String[] args){
    
        double numero,metade,dobro;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
        
            if(numero > 10){
                metade = numero/2;
                JOptionPane.showMessageDialog(null, "A metade de " + numero + "é " + metade);
            }
            else{
                dobro = numero * 2;
                JOptionPane.showMessageDialog(null, "O dobro é: " + dobro);
            }
    }
    
}
