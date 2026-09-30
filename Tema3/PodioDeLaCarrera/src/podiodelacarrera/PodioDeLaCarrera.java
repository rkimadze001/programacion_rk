/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package podiodelacarrera;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class PodioDeLaCarrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int participante1, participante2, participante3, 
                participante4, tiempoGuardador;
        
        Scanner entrada = new Scanner(System.in);
        //entradas
        //Primero participante
        System.out.println("Entra tiempo de primero participante: ");
        participante1= entrada.nextInt();
       
        //Segundo participante
        System.out.println("Entra tiempo de segundo participante: ");
        participante2 = entrada.nextInt();
        
        //Tercero participante
        System.out.println("Entra tiempo de tercero participante: ");
        participante3 = entrada.nextInt();
        
        //Cuatro participante
        System.out.println("Entra tiempo de cuatro participante: ");
        participante4 = entrada.nextInt();
        
        // ordenar a menor to mayor
    }
    
}
