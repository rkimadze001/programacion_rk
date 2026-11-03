/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 * Programa: contenga un método donde le pidamos al usuario su nombre, otro
 * método donde le pidamos su edad y otro método llamado mayorDeEdad, que reciba
 * la edad como entero por parámetro y muestre un mensaje por pantalla de si el
 * usuario llamado XXX es mayor de edad o no.
 * @author RusudanKimadze
 */
public class Ejercicio24 {
    
    /**
     * El metodo para pedir nombre a usuario y devolver este valor
     * @return 
     */
    public static String pedirNombre(){
        String nombre;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor introduzca tu nombre:");
        nombre = entrada.nextLine();
        
        return nombre;
    }
    
    /**
     * El metodo para pedir edad a usuario y devolver este valor
     * @return 
     */
    public static int pedirEdad(){
        int edad;
         
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ahora introduzca tu edad: ");
        edad = entrada.nextInt();
        
        return edad;
    }
    
    /**
     * El metodo que comproba si el usuario es mayor de edad y imprimir en la pantalla el resultado
     * @param edad
     * @param nombre 
     */
    public static void mayorDeEdad(int edad, String nombre){
        if(edad >= 18 ){
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
