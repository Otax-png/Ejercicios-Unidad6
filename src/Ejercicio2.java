package src;

import java.util.Scanner;

public class Ejercicio2 {

    Scanner entrada = new Scanner(System.in);
    int listaNumeros [] = new int[10];
    int valorMax = 0;
    int nmRepetidos = 0;

    public static void main(String[] args) {
        Ejercicio2 t2 = new Ejercicio2();
    }

    public Ejercicio2(){
        for (int i = 0; i < listaNumeros.length; i++) {
            rellenarCasilla(i);
        }
        for (int i = 0; i < listaNumeros.length; i++) {
            mostrarDatos(i);
            maxElementANDTimes(i);
        }

        System.out.println("El elemento mayor del arreglo es: " + valorMax + " y se repite " + nmRepetidos + " veces.");
    }

    public void rellenarCasilla(int number){
        int aleatorio;
        aleatorio = ((int)Math.floor(Math.random()*99 - 0 +1) + 0);
        listaNumeros[number] = aleatorio;
    }

    public void mostrarDatos(int number){
        System.out.println(listaNumeros[number]);
    }

    public void maxElementANDTimes(int number){


        if(listaNumeros[number] > valorMax){
            valorMax = listaNumeros[number];
        } else if (listaNumeros[number] == valorMax){
            nmRepetidos++;
        }
    }

}