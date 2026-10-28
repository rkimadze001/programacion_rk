/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio24 {
    
    
    public static String pedirNombre(){
        String nombre;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor introduzca tu nombre:");
        nombre = entrada.nextLine();
        
        return nombre;
    }
    
    public static int pedirEdad(){
        int edad;
         
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ahora introduzca tu edad: ");
        edad = entrada.nextInt();
        
        return edad;
    }
    
    public static void mayorDeEdad(int edad, String nombre){
        if(edad > 80){
            System.out.println("El usuario llamado " + nombre + " es mayor de edad.");
        }else{
            System.out.println("El usuario llamado " + nombre + " no es mayor de edad.");
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int edad;
        String nombre;
        
        nombre = pedirNombre();
        edad = pedirEdad();
        
        mayorDeEdad(edad, nombre);
    }
    
}
