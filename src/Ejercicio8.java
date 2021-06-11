package src;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        String palabras1[] = new String[5];
        String palabras2[] = new String[5];
        System.out.println("Primer string");
        palabras1 = llenarArreglos(palabras1);
        System.out.println("Segundo string");
        palabras2 = llenarArreglos(palabras2);
        compararArreglos(palabras1, palabras2);
    }

    public static String[] llenarArreglos(String arreglo[]){
        Scanner lectura = new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese la palabra " + (i+1) + ": ");
            arreglo[i] = lectura.nextLine();
        }
        return arreglo;
    }

    public static void compararArreglos(String arreglo1[], String arreglo2[]){
        for (int i = 0; i < arreglo1.length; i++) {
            String sonIguales = "";
            if(arreglo1[i].equals(arreglo2[i])){
                sonIguales = "Son iguales";
            }
            else{
                sonIguales = "No son iguales";
            }
            System.out.println("arreglo1[" + i +"].length = " + arreglo1[i].length());
            System.out.println("arreglo2[" + i +"].length = " + arreglo2[i].length());
            System.out.println(sonIguales);
            System.out.println("=============");
        }
    }
}