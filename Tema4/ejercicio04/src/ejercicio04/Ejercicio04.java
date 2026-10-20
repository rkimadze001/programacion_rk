/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;

/**
 * Programa: pida tres números (en el main) y se los pase a un método que los
 * imprima por pantalla el menor de ellos.
 * @author RusudanKimadze
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //declarar variables
       int num1, num2, num3;
       
       Scanner entrada = new Scanner (System.in);
       //imprimir en la pantalla
       System.out.println("Por favor, introduzca el primer numero: ");
       num1 = entrada.nextInt();
       System.out.println("Ahora, introduzca un segundo numero: ");
       num2 = entrada.nextInt();
       System.out.println("Por último, introduzca un tercer numero: ");
       num3 = entrada.nextInt();
       
       //llamar serMenor() metodo en main
      SerMenor.serMenor(num1, num2, num3);
    }
    
}
