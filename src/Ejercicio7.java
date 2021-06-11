package src;

public class Ejercicio7 {

    public static void main(String[] args) {
        Ejercicio7 t7 = new Ejercicio7();
    }

    int matriz1[][] = new int[4][3];
    int matriz2[][] = new int[4][3];
    int x, y, aleatorio, sumaFila = 0;

    public Ejercicio7(){
        generarCasilla(x,y);
        mostrarDatos();
    }

    public void generarCasilla(int numX, int numY){
        for(numX = 0 ; numX < 4; numX++){
            for (numY = 0; numY < 3; numY++) {
                aleatorio =(int)(Math.random() * (555));
                matriz2 [numX][numY] = aleatorio;
            }
        }
    }

    public void mostrarDatos(){
        for(int x = 0 ; x < 4; x++){
            for (int y = 0; y < 3; y++) {
                System.out.print(matriz2[x][y] +"\t");
            }
            System.out.println();
        }
    }
}