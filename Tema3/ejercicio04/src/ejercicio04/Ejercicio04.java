/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;
import java.util.Scanner;
/**
 * Programa: pida tres números e imprima por pantalla el menor de ellos.
 * @author RusudanKimadze
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un tercer numero: ");
        numero3 = entrada.nextInt();
        
        //condiciones
        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("El número menor de los introducidos es el " + numero1);
        }else if (numero2 < numero1 && numero2 < numero3 ){
            System.out.println("El número menor de los introducidos es el " + numero2);
        }else{
            System.out.println("El número menor de los introducidos es el " + numero3);
        }
        
    }
    
}
