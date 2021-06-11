package src;

import java.util.Scanner;
public class Ejercicio4 {

    Scanner entrada = new Scanner(System.in);
    int [] arregloE4 = new  int[10];
    int datoMayor = 0;

    public static void main(String[] args) {
        Ejercicio4 t4 = new Ejercicio4();
    }

    public Ejercicio4(){
        for (int i = 0; i < arregloE4.length; i++) {
            rellenarCasilla(i);
        }

        for (int i = 0; i < arregloE4.length; i++) {
            valorMayor(i);
        }

        compararDistancia();
    }

    public void rellenarCasilla(int number){
        int aleatorio;
        aleatorio = ((int)Math.floor(Math.random()*99 - 0 +1) + 0);
        arregloE4[number] = aleatorio;
        System.out.println(arregloE4[number]);
    }

    public void valorMayor(int numero) {
        int actual = arregloE4[numero];
        if (actual > datoMayor) {
            datoMayor = actual;
        }
    }

    public void compararDistancia(){
        for (int i = 0; i < arregloE4.length; i++) {
            int contador = i + 1;
            int diferencia = datoMayor - arregloE4[i];
            System.out.println("La distancia que lo separa del numero mayor es: " + diferencia);
        }
    }
}