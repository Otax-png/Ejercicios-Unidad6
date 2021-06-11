package src;

import java.util.Scanner;

public class Ejercicio6 {

    int[][] matrizElementos = {{5, 6, 13}, {14, 2, 4}, {21, 7, 6}};
    int[][] matrizAux = new int[3][3];
    int x, y;

    public static void main(String[] args) {
        Ejercicio6 t6 = new Ejercicio6();
    }

    public Ejercicio6(){

        mostrarElementos(x,y);
        //MULTIPLICAR MATRIZ INICIAL POR 2
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                matrizAux[x][y] = matrizElementos[x][y] * 2;
            }
        }
        mostrarDatos(x,y);
    }

    public void mostrarDatos(int px, int py){
        System.out.println("Matriz Inicial multiplicada por 2");
        for(px = 0 ; px < 3; px++){
            for (py = 0; py < 3; py++) {
                System.out.print(matrizAux[px][py] +"\t");

            }
            System.out.println();
        }
    }

    public void mostrarElementos(int px, int py){
        System.out.println("Matriz Inicial");
        for(px = 0 ; px < 3; px++){
            for (py = 0; py < 3; py++) {
                System.out.print(matrizElementos[px][py] +"\t");

            }
            System.out.println();
        }
    }
}