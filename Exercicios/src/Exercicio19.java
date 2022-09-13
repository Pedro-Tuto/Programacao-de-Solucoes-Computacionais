import javax.swing.*;

public class Exercicio19 {
    public static void main(String[] args){
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        int numeroVezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de vezes que quer repetir a frase: "));
        int i;
        for(i = 0; i <= numeroVezes; i++){
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}
