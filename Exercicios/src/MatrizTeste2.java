
public class MatrizTeste2 {
    public static void main(String[] args){
        
        int[][]matrix = new int [4][4];
        
        for(int i = 0; i < matrix.length; i++ ){
            System.out.print("Linha " + i + " : ");
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print("Coluna " + j + " ");
            }
            System.out.println();
        }
    }
}
