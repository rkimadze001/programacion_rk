/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio34;

import java.util.Scanner;

/**
 *
 * @author RusudanKimadze
 */
public class Ejercicio34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salidaDia, salidaHora, salidaMinuto,
                llegadaDia, llegadaHora, llegadaMinuto;
        int minutoTarda, horaTarda;
        
        Scanner entrada = new Scanner(System.in);
        
        //entradas salidas
        System.out.print("Entra un dia de salida: ");
        salidaDia = entrada.nextInt();
        System.out.print("Entra una hora de salida: ");
        salidaHora = entrada.nextInt();
        System.out.print("Entra un minuto de salida: ");
        salidaMinuto = entrada.nextInt();
        
        //entradas llegada
        System.out.print("Entra un dia de llegada: ");
        llegadaDia = entrada.nextInt();
        
        //comprobar de entrada el dia salida y el dia llegada
        while(salidaDia >llegadaDia ){
            System.out.println("Ups Error. El dia salida no podria ser mayor de dia llegada.");
            entrada.nextLine();
            System.out.print("Entra un dia de llegada: ");
            llegadaDia = entrada.nextInt();
        }
        System.out.print("Entra una hora de llegada: ");
        llegadaHora = entrada.nextInt();
        System.out.print("Entra un minuto de llegada: ");
        llegadaMinuto = entrada.nextInt();
        
        
        //condicionales y calculationes de minutos
        if(salidaMinuto > llegadaMinuto){
            llegadaHora --;
            minutoTarda = (llegadaMinuto + 60) - salidaMinuto;               
        }else{
            minutoTarda = llegadaMinuto - salidaMinuto;             
        }
        
        //condicionales y calculationes de horas
        if(salidaDia == llegadaDia){
            horaTarda = llegadaHora - salidaHora; 
        }else{   
            horaTarda = (24 + llegadaHora) - salidaHora;  
        }
        //imprimir en la pantalla
        
        System.out.println("\nUn tren en llegar a su destino en " + horaTarda+" horas y " +minutoTarda+ " minutos.");
    }
    
}
