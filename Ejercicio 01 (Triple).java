import java.util.Scanner;
/**
 * Ejercicio de Introducción a la Informática
 */
public class Excercise {
    public static void main(String[] args) {
        triple();
    }    
    
    // Método a desarrollar
    public static void triple () {
        // Añada aquí su código
        Scanner input = new Scanner(System.in);
        int n1=input.nextInt();
        int triple=n1*3;
        System.out.println(triple);
    }
}