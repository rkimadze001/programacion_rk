/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio30;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa: que juegue con el usuario a adivinar un número. El ordenador debe
 * generar un número entero aleatorio entre 1 y 100, y el usuario tiene que
 * intentar adivinarlo. si el usuario introduce algo que no es un número 
 * (una letra, por ejemplo) se le avisará del error por pantalla y se contará como un intento.
 * @author RusudanKimadze
 */
public class Ejercicio30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //varble declaracion y inicializacion    
        double aleatorio = Math.floor(Math.random() * 100 +1);
        int numeroEntrada = 0, cont = 0 ;
        
        //casting - cambiamos typo de aleatorio
        int aleatorioEntero = (int) aleatorio;
        
        //creamos nueva instancia de objecto scanner
        Scanner entrada = new Scanner(System.in);
        
        //imprimir en la plantalla
        System.out.println("---- Juego: adivinar un número ----");
        
        //bulce para pedir el numero a usuario     
              
        while(numeroEntrada != aleatorioEntero){
            //para contar cada iteracion 
            cont ++;
            
            //capturar exception si usuario entra algo que no es un numero
            try{ 
                System.out.println("Por favor entra un numero entre 1 y 100: ");
                numeroEntrada = entrada.nextInt(); 

                if(aleatorioEntero > numeroEntrada){
                    System.out.println("El numero que tienes que adivinar es mayor que el numero introducido.");
                }else if (aleatorioEntero < numeroEntrada){
                    System.out.println("El numero que tienes que adivinar es menor que el numero introducido.");
                }else {
                    System.out.println("Adivinaste el número!!!");  
                }
                      
            }catch(InputMismatchException e){
                System.out.println("No puede entrar algo que no es numero. Inténtalo de nuevo.");
                entrada.nextLine();  
            }     
        } 
        
        System.out.println("Has intentado " + cont + " veces.");
    }
        
}
    

