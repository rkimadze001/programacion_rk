/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 * Programa: Te pida tu nombre y a continuación te lo muestre 5 veces.
 * @author ruskakimadze
 */
public class Ejercicio18 {
    
    /**
     * El metodo para pedir el nombre a usuario.
     * @return 
     */
    public static String pedirNombre(){
        String nombre;
        //crear nuevo instancia de objeto Scanner y despues monstrat el mensage guardar valor entrada a usuario
        //en variable nombre
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca tu nombre aqui: ");
        nombre = entrada.nextLine();
        
        //devolver el nombre
        return nombre;
    }
    
    /**
     * El metodo para imprimir el nombre cinco veces.
     * @param nombre 
     */
    public static void mostrarMensage(String nombre){
        
        //bucle para imprimir nombre 5 veces.
        for(int i=0; i<5; i++){
            System.out.println("Hola " + nombre + "!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar variable
        String nombre;
        
        //llamar el metodo pedirNombre() y guardar esto information en variable nombre
        nombre = pedirNombre();
        //llamar el metodo mostrarMensage() en main y pasar argumento el variable nombre
        mostrarMensage(nombre);
    }
    
}
