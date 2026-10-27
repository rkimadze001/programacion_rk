/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 * Programa: Escribe un programa que juegue con el usuario a adivinar una letra
 * minúscula. El ordenador debe generar una letra aleatoria entre a y z, y el usuario tiene que intentar adivinarla.
 * @author RusudanKimadze
 */
public class Ejercicio17 {
    
   /**
    * El metodo pedir un caracter a usuario y devolva esto caractero
    * @return 
    */
   public static char pedirCaractero(){
       char caracteroEntrada;    
       Scanner entrada = new Scanner(System.in);
       caracteroEntrada = entrada.nextLine().charAt(0);
       return caracteroEntrada;
    }
   
   /**
    * El metodo pasa un parametro caractero y hace cast para cambiar esto valor a integer, luego
    * devolva este integer.
    * @param caractero
    * @return 
    */

   public static int castCaractero(char caractero){
       int numeroCaractero;
       
       numeroCaractero = (int)caractero;
       return numeroCaractero;
       
    }
   
   /**
    * El metodo genera numero aleatorio y devolva esto. 
    * @return 
    */
     public static int numeroAleatorio(){
       int numeorAleatorio;
       
       numeorAleatorio = (int)(Math.random() * (122 - 97 + 1)) + 97;
       
       return numeorAleatorio;
    } 
    
     /**
      * El metodo comproba el codigo de caractere entrada a usuario y muestra mensage adequada para ayudar usuario.
      * @param castCaractero
      * @param numeroAleatorio 
      */
    public static void comprobarCaracteros(int castCaractero, int numeroAleatorio){
        if (castCaractero > numeroAleatorio){
            System.out.println("La letra que tienes que adivinar es antes de la letra entrada.");
        }else if (castCaractero < numeroAleatorio){
            System.out.println("La letra que tienes que adivinar es despues de la letra entrada.");

        }else{
            System.out.println("Enorabuena!!! Tu has adivinado un letra! La letra para adivinar ha sido: " + (char)numeroAleatorio);
        }
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letraEntrada;
        int codigoLetraEntrada;
        int numeroAleatorio;
        int cont = 0;
        
        numeroAleatorio = numeroAleatorio();
        
        do{
            System.out.println("Entra una letra entre a y z:");
            letraEntrada = pedirCaractero();
            codigoLetraEntrada = castCaractero(letraEntrada);
                 
            comprobarCaracteros(codigoLetraEntrada, numeroAleatorio);
            cont ++;
            
        }while(codigoLetraEntrada != numeroAleatorio);
        
        System.out.println("El numero de intentos es: "  + cont);
    }
    
}
