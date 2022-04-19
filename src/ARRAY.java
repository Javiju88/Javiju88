import java.util.*;
public class ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j;
        int i;
        int[] numeros = new int[10]; //array que contendrá los números leídos por teclado
        int[] contador= new int [10];
        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("Dime el número de la posicion "+i+" del array: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("\nLos numeros del array son: ");
        for (i=0; i< numeros.length; i++){
            System.out.print(numeros[i]+",");
        }
        for (i =0; i < numeros.length; i++) {

            contador[numeros[i]] += 1;

        }
        System.out.println("\n\nRepeticiones:");
        for (j =0; j< contador.length;j++){

            System.out.print("\n{"+j+"="+contador[j]+"veces}");
        }
    }

}