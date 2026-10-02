/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;
import java.util.Scanner;
/**
 * Programa: al que introduciéndole el tamaño de un archivo en MB y la velocidad 
 * de tu ADSL (en megabits) te calcule el tiempo 
 * en minutos que tardarías en descargártelo
 * @author RusudanKimadze
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tamanioMB, velocidadMbps, tamanioMegabits, 
                tiempoSegundos, tiempoMinutos;
                
        Scanner entrada = new Scanner(System.in);
        
        //entrada de datos
        System.out.print("Introduce el tamaño del archivo en MB: ");
        tamanioMB = entrada.nextDouble();
        System.out.print("Introduce la velocidad del ADSL en Megabits (Mbps): ");
        velocidadMbps = entrada.nextDouble();

        // calculacion
        // MB a Megabits (1 MB = 8 Megabits)
        tamanioMegabits = tamanioMB * 8;

        // tiempo en segundos
        tiempoSegundos = tamanioMegabits / velocidadMbps;

        // tiempo en minutos
        tiempoMinutos = tiempoSegundos / 60;

        // resultado
        System.out.println("El tiempo estimado de descarga es: "+ tiempoMinutos + " minutos");
    
    }
    
}
