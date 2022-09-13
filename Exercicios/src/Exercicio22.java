import javax.swing.*;

public class Exercicio22 {
    public static void main(String[] args){
        int i = 0;
        int soma = 0;
        double media = 0;
        while(i <= 1000){
           
            soma += i;
            //System.out.println("i: " + i);
            //System.out.print("Soma: " + soma);
            //System.out.print(media);
            i++;
            
        }
        //System.out.println("i: " + i);
        //System.out.print("Soma: " + soma);
        media = soma/1000;
        System.out.println("Média: " + media);
    }
    
    
}
