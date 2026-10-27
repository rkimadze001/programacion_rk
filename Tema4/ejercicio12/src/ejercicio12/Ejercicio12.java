/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 * Programa: le pida una contraseña al usuario. Si la escribe bien le dará 
 * la enhorabuena, pero si la escribe mal 3 veces le dará un mensajede error de acceso.
 * @author RusudanKimadze
 */
public class Ejercicio12 {
    //declarar y iniciar contrasenia como constante
    final static int CONTRASENIA = 1601;
     
    /**
     * El metodo le pide la contrasenia a usuario y devolve esto contrasenia
     * @return 
     */
    public static int pedirContrasenia(){
        int contraseniaEntrada;
        
        Scanner entrada = new Scanner(System.in);
        contraseniaEntrada = entrada.nextInt();
        
        return contraseniaEntrada;
    }
    
   /**
    * El metodo devolve true si CONTRASENIA iguals a contrasenia entrada de usuario
    * @param contraseniaEntrada
    * @return 
    */
    public static boolean esValido(int contraseniaEntrada){
        return contraseniaEntrada ==  CONTRASENIA;
    }
    
    /**
     * El metodo comproba si metodo esValido es true o false y mostra mensage enhorabuena o error
     * @param esValido
     * @param cont
     */
    
    public static void mostrarResultado (boolean esValido, int cont){
        if(esValido){
            System.out.println("enhorabuena");
        }else{
            if(cont == 3){
                System.out.println("Error de acceso");
            }      
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declarar y iniciar variables
        int cont = 0, contraseniaEntrada;
        boolean valido;
        
        //bucle para imprimir y comprobar contracenia 
        do{
             System.out.println("Introduzca contraseña (pista 4 digitos): ");
             
             //llamar el metodo perirContrasenia y guardar valor en contraseniaEntrada
             contraseniaEntrada = pedirContrasenia();
             
             
             // llamar el metodo esValido y guardar valor en valido
             valido = esValido(contraseniaEntrada);
             
             //condicional para incrementar cont si contrasenia no es la verdad
             if(!valido){
                 cont ++;       
             }
             //llamar metodo mostratResultado 
             mostrarResultado(valido, cont); 
             
        }while(cont < 3 || valido);
        
    }
    
}
