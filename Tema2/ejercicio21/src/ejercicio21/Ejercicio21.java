/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;
/**
 * Programa: solicita al usuario una cantidad en segundos y la convierta a días, horas,
 * minutos y segundos y muestra por la pantalla.
 * @author RusudanKimadze
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int días, tiempoEnHoras, tiempoEnMinutos, tiempoEnSegundos;
        
        //entrada de usuario 
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número de segundos:");
        
        int segundos = entrada.nextInt();
        
        //calculationes 
        días = segundos/(24*60*60);
        tiempoEnHoras = (segundos%(24*60*60))/(60*60);
        tiempoEnMinutos = (segundos%(24*60*60)%(60*60))/60;
        tiempoEnSegundos = segundos % 60;
        
        //imprimir en plantalla
        System.out.println( segundos+ " segundos hacen un total de : "+días+" días, "+tiempoEnHoras+" horas, "+tiempoEnMinutos+" minutos y\n" +tiempoEnSegundos+
" segundos.");
        
       
    }
    
}

