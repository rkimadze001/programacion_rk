/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio02;
import java.util.Scanner;

/**
 * programa: le solicita en el main al usuario 2 números y, si el primer número
 * introducido es mayor que 10, se llamará a un método que los multiplicará y
 * mostrará el resultado, y en caso contrario se llamará a un método que los
 * sume.
 * @author RusudanKimadze
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero:  ");
        num2 = entrada.nextInt();
        
        if(num1 > 10){
            Multiplicar.multiplicar(num1, num2);
        }else {
            Sumar.sumar(num1, num2);
        }
        
    }
    
}
