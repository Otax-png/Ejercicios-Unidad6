package src;

import java.util.*;

public class Ejercicio3 {

    Scanner entrada = new Scanner(System.in);
    int [] listaElementos = new int[8];

    public static void main(String[] args) {
        Ejercicio3 t3 = new Ejercicio3();
    }

    public Ejercicio3(){

        for (int i = 0; i < listaElementos.length; i++) {
            rellenarCasilla(i);
            mostrarCasilla(i);
        }
        System.out.println("\nPuedes buscar un numero en el arreglo");
        buscarNumbero();
    }

    public void rellenarCasilla(int number){
        int aleatorio;
        aleatorio = ((int)Math.floor(Math.random()*99 - 0 +1) + 0);
        listaElementos[number] = aleatorio;
        System.out.println(listaElementos[number]);
    }

    public int mostrarCasilla(int number){
        return  listaElementos[number];
    }

    public void buscarNumbero(){
        int checkNumber = entrada.nextInt();

        for (int i = 0; i < listaElementos.length; i++) {
            int contador = i + 1;
            System.out.println("Buscando en: " + contador + "° posicion");

            if (checkNumber == listaElementos[i]){
                System.out.println("Se encontró una coincidencia en: " + contador + "° psosicion, esta es: " + listaElementos[i]);
                break;
            } else {
                System.out.println("No se encontró alguna coincidencia.");
            }

        }

    }
}