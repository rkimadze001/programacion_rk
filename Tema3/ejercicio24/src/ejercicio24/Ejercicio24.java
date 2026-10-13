/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;
import java.util.Scanner;

/**
 * Programa: imprima todos los números múltiplos de 3 que existen entre el
 * número 1 y otro número introducido por el usuario. • Controla que el usuario
 * te meta un número mayor que 0 y, sino, avísale del error y vuélveselo al
 * pedir las veces que hagan falta.
 * @author RusudanKimadze
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar y inicializar variables
        int numeroPrimero = 1;
        int numeroUltimo;
        int cont=0;
        
        //crear una instancia de objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        //bucle para comprobar entrada de usuario
        
        do{
            System.out.println("Por favor entra el numero:");
            numeroUltimo = entrada.nextInt();
            if(numeroUltimo <= 0){
                System.out.println("Ups error, el numero no es mas de 0!!! ");
            }
        } while(numeroUltimo <= 0);
        
    
        //bucle para imprimir todos los multiples de 3 entre numeroPrimero y numeroUltimo
        while(numeroPrimero < numeroUltimo){
            if(numeroPrimero % 3 ==0){
                System.out.print(numeroPrimero + " - ");
                cont++;
            }
            numeroPrimero ++;
        }
        
        System.out.println("\nTotal de números múltiplos de 3: " +  cont + " numeros.");
    }
}
