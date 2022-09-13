import javax.swing.*;

public class Exercicio23 {
    public static void main(String[] args){
        int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial: "));
        int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));
        int i = 0;
        int soma = 0;
        while(i <= numeroFinal){
            
            soma += i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "A soma entre " + numeroInicial + " e " + numeroFinal + " é: " + soma);
    }
    
}
