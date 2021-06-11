package src;

public class Ejercicio9 {
    public static void main(String[] args) {
        int m1[][] = {
                {1,2,3},
                {6,5,4},
                {7,4,2},
                {2,3,5}
        };
        int m2[][] = m1;
        sumaMatrices(m1, m2);
    }

    public static void sumaMatrices(int[][] matriz1, int[][]matriz2){

        try{
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    matriz1[i][j] = matriz1[i][j] + matriz2[i][j];
                }
            }

            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[i].length; j++) {
                    System.out.print(matriz1[i][j] + "\t");
                }
                System.out.println();
            }
        }
        catch (Exception ex){
            System.out.println("Revise las dimensiones de las matrices");
        }
    }
}