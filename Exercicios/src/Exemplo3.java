import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args){
    
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        if((numero % 10) == 0) {
            JOptionPane.showMessageDialog(null, "É múltiplo de 10!");
        }else{
            if((numero % 5) == 0){
                JOptionPane.showMessageDialog(null, "É múltiplo de 5!");
            }else{
                if((numero % 2 == 0)){
                    JOptionPane.showMessageDialog(null, "É múltiplo de 2!");
                }else{
                    JOptionPane.showMessageDialog(null, "DEU PAU NA KOMBI!");
                }
            }
        }
}
    }
