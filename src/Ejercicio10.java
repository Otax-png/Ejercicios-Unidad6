
package src;

import java.util.Scanner;

public class Ejercicio10 {

    //clase main
    public static void main(String[] args) {
        Ejercicio10 ej = new Ejercicio10();
    }

    int matriz1 [][] = new int[3][4];
    int matriz2 [][] = new int[4][3];

    int x, y, aleatorio, sumaFila = 0;


    public Ejercicio10(){

        generarCasillas();
        mostrarIngresados();
        transpuesta();
        mostrarMatriz();
    }

    public void generarCasillas(){
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 4; y++) {
                aleatorio =(int)(Math.random() * (50));
                matriz1 [x][y] = aleatorio;
            }
        }
    }

    public void mostrarIngresados(){
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 4; y++) {
                System.out.print(matriz1[x][y] +"\t");
            }

            System.out.println();
        }

    }

    public void transpuesta(){
        System.out.println();
        for(int x = 0 ; x < 3; x++){
            for (int y = 0; y < 4; y++) {
                matriz2[y][x] = matriz1[x][y];
            }

            System.out.println();
        }

    }

    public void mostrarMatriz(){
        for(int x = 0 ; x < 4; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz2[x][y] + "\t");
            }

            System.out.println();
        }
    }

}