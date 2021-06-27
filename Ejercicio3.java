package Clase3;
import java.util.Scanner;

//Ejercicios 3-4-5
public class Ejercicio3 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = input.nextInt();

       /* System.out.println("Ingrese otro número");
        int num2 = input.nextInt();*/
        System.out.println("Ingrese otro número");
        double num2 = input.nextDouble();

        //int producto = multiplicar (num1, num2);
       System.out.println("El resultado de la multiplicación es " + multiplicar(num1,num2));

       /* int resultado = sumar (num1, num2);
        System.out.println("El resultado de la suma es " + resultado);*/
    }

   /* public static int multiplicar (int num1, int num2){
        return num1 + num2;
    } */
   /* public static int sumar (int num1, int num2){
        return num1 + num2;
    }*/
   public static double multiplicar (int num1, double num2) {
       double multiplicar = num1 * num2;
       return multiplicar;
   }
}
