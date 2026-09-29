/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;
/**
 *programa: le solicites al usuario 2 números y, si el primer número introducido es mayor que 10, se
multipliquen, y en caso contrario que se sumen.
 * @author RusudanKimadze
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, resultado;
        
        //usar scanner para solicitar numeros
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Por favor, introduzca un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        
        //consiciones y resultado
        if(numero1 > 10){
            resultado = numero1 * numero2;
            System.out.println("La operacion es multipliqar y el resultado es " + resultado);

        }else{
            resultado = numero1 + numero2;
            System.out.println("La operacion es sumar y el resultado es " + resultado);
        }

    }
    
}
