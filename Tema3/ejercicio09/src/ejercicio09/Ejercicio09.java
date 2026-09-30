/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import java.util.Scanner;
/**
 *Programa: el usuario introduzca cuatro números enteros y 
 * luego el programa los muestre por pantalla ordenados 
 * de forma creciente.(de menor a mayor).
 * @author RusudanKimadze
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1, numero2, numero3, numero4, 
                numeroParaCambiar;
        
        Scanner entrada = new Scanner(System.in);
        //entradas 
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        numero3 = entrada.nextInt();
        
        System.out.println("Por último, introduzca un cuarto numero: ");
        numero4  = entrada.nextInt();
        
        //iteracionn 1 
        if(numero1>numero2){
            numeroParaCambiar = numero1;
            numero1 = numero2;
            numero2 = numeroParaCambiar;
        }
        
        if(numero2>numero3){
            numeroParaCambiar = numero2;
            numero2 = numero3;
            numero3 = numeroParaCambiar;
        }
        
        if(numero3>numero4){
            numeroParaCambiar = numero3;
            numero3 = numero4;
            numero4 = numeroParaCambiar;
        }
        
        //iteracion 2
        
        if(numero1>numero2){
            numeroParaCambiar = numero1;
            numero1 = numero2;
            numero2 = numeroParaCambiar;
        }
        
        if(numero2>numero3){
            numeroParaCambiar = numero2;
            numero2 = numero3;
            numero3 = numeroParaCambiar;
        }
      
        //iteracion 3
        if(numero1>numero2){
            numeroParaCambiar = numero1;
            numero1 = numero2;
            numero2 = numeroParaCambiar;
        }
        
        //resultado en pantalla 
        System.out.println("El orden de los números introducidos es el " + numero1+ " - " + numero2+ " - " + numero3+ " - " + numero4);
    }
    
}
