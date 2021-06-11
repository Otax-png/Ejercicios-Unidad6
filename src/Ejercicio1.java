package src;

import java.util.Scanner;

public class Ejercicio1 {

    Scanner entrada = new Scanner(System.in);
    int valorIngresado [] = new int[5];

    public static void main(String[] args) {
        Ejercicio1 t = new Ejercicio1();
    }

    public Ejercicio1() {
        System.out.println("Hola, ingresa 5 numeros de tipo entero\n");

        for (int i = 0; i < valorIngresado.length; i++) {
            registroDatos(i);
        }

        for (int i = 0; i < valorIngresado.length; i++) {
            mostrarValores(i);
        }
    }

    public void registroDatos(int number){
        System.out.println("Ingresa un numero");
        valorIngresado[number] = entrada.nextInt();
    }

    public void mostrarValores(int number){
        int contador = number+1;
        System.out.println("");
        System.out.println("El " + contador + "° numero ingresado fue " + valorIngresado[number]);
    }
}

