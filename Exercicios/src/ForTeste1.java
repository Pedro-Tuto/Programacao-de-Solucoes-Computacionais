import javax.swing.JOptionPane;

public class ForTeste1 {
    
    public static void main(String[] args){
        int counter;
        for(counter = 1; counter <= 10; counter++){
            System.out.println(counter);
            if(counter %2 == 0){
                JOptionPane.showMessageDialog(null, counter + " é par");
            }
            
        }
    }
    
        
    
}
