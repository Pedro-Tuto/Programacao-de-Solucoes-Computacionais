import javax.swing.*;
import java.util.ArrayList;

public class Exercicio25 {
    public static void main(String[] args){
        int matriz[][] = new int[3][3];
        int i, j;
        int somaPrimeiraColuna = 0;
        int somaSegundaColuna = 0;
        int somaTerceiraColuna = 0;
        int produtoPrimeiraLinha = 1;
        int somaTodos = 0;
        int numeroElementos = 0;
        int mediaTodos = 0;
        int maiorDaMatriz = Integer.MIN_VALUE;
        int menorDaMatriz = Integer.MAX_VALUE;
        
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Linha "+i+" e Coluna "+j+":"));
            }
        }
        
        
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(matriz[i][j]);
                maiorDaMatriz = Math.max(matriz[i][j], maiorDaMatriz);
                menorDaMatriz = Math.min(matriz[i][j], menorDaMatriz);
                if(j==0){
                    somaPrimeiraColuna += matriz[i][j]; 
                    somaTodos += matriz[i][j];
                    numeroElementos += 1;
                    
                }else if(j==1){
                    somaSegundaColuna += matriz[i][j];
                    somaTodos += matriz[i][j];
                    numeroElementos += 1;
                }else if(j==2){
                    somaTerceiraColuna += matriz[i][j];
                    somaTodos += matriz[i][j];
                    numeroElementos += 1;
                }
                
                if(i==0){
                    produtoPrimeiraLinha *= matriz[i][j];
                }
            }
            System.out.println();
            mediaTodos = (somaTodos / numeroElementos);
        }
        
        ArrayList<Integer> maioresQueMedia = new ArrayList<Integer>();
        
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if(matriz[i][j] > mediaTodos){
                    maioresQueMedia.add(matriz[i][j]);                    
                }
            }
        }
        
        System.out.println("Soma da Primeira Coluna: " + somaPrimeiraColuna);
        System.out.println("Soma da Segunda Coluna: " + somaSegundaColuna);
        System.out.println("Soma da Terceira Coluna: " + somaTerceiraColuna);
        System.out.println("Produto da Primeira Linha: " + produtoPrimeiraLinha);
        System.out.println("Soma de Todos os Elementos: " + somaTodos);
        System.out.println("Média de Todos os Elementos: " + mediaTodos);
        System.out.println("Elementos Maiores que a Média: " + maioresQueMedia);
        System.out.println("O Maior Elemento é: " + maiorDaMatriz);
        System.out.println("O Menor Elemento é: " + menorDaMatriz);
        
        JOptionPane.showMessageDialog(null, "Matriz: \n" +
                                            matriz[0][0] +"  "+ matriz[0][1] +"  "+ matriz[0][2] + "\n" +
                                            matriz[1][0] +"  "+ matriz[1][1] +"  "+ matriz[1][2] + "\n" +
                                            matriz[2][0] +"  "+ matriz[2][1] +"  "+ matriz[2][2] + "\n" +
                                            "Soma da Primeira Coluna: " + somaPrimeiraColuna + "\n" +
                                            "Soma da Segunda Coluna: " + somaSegundaColuna + "\n" +
                                            "Soma da Teceira Coluna: " + somaTerceiraColuna + "\n" +
                                            "Produto da Primeira Linha: " + produtoPrimeiraLinha + "\n" +
                                            "Soma de Todos os Elementos: " + somaTodos + "\n" +
                                            "Média de Todos os Elementos: " + mediaTodos + "\n" +
                                            "Elementos Maiores que a Média: " + maioresQueMedia + "\n" +
                                            "O Maior Elemento é: " + maiorDaMatriz + "\n" +
                                            "O Menor Elemento é: " + menorDaMatriz
        );
        
    }
    
}
