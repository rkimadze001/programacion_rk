/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio19 {
    
    
    public static String pedirDia(){
        String dia;
        //crear nuevo instancia de objeto Scanner. 
        
        Scanner entrada = new Scanner(System.in);
        //monstrat el mensage guardar valor entrada a usuario en variable nombre.
        System.out.println("Por favor, introduzca un día de la semana: ");
        dia = entrada.nextLine();
        
        //devolver el dia
        return dia;
    }
    
    public static void comprobarDia(String dia){
        
        switch(dia){
            case "Lunes":
                System.out.println("El Lunes es el primer dia de la semana.");
                break;
            case "Martes":
                System.out.println("El Martes es el segundo dia de la semana.");
                break;
            case "Miercoles": 
                System.out.println("El Miercoles es el tercer dia de la semana.");
                break;
            case "Jueves":
                System.out.println("El Jueves es el cuarto dia de la semana.");
                break;
            case "Viernes":
                System.out.println("El Lunes es el quinto dia de la semana.");
                break;
            case "Sabado":
                System.out.println("El Sabado es el sexto dia de la semana.");
                break;
            case "Domingo":
                System.out.println("El Domingo es el septimo dia de la semana.");
                break;
            default: 
                System.out.println("El palabra introducido no hay el dia de la semana.");
                
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dia;
        
        dia = pedirDia();
        comprobarDia(dia);
        
    }
    
}
