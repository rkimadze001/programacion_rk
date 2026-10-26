/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 * Programa: Diseña un programa en JAVA que pida al usuario dos números por
 * teclado. Posteriormente el programa mostrará un menú que le permitirá al
 * usuario: • 1.- Sumar los números. • 2.- Restar los números. • 3.- Multiplicar
 * los números. • 4.- Dividir los números. • 5.- Salir del programa.
 * @author RusudanKimadze
 */
public class Ejercicio15 {
    
    /**
     * El metodo pedir a usuario un numero y revolva esto numero
     * @return 
     */
    public static int pedirNumero(){
        int numeroEntrada;
        
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        return numeroEntrada;
        
    }
    
   /**
    * El metodo muestra el menu de que el usuario puede elegir.
    */
    public static void mostrarMenu(){
        
        System.out.println("Elige una operacion con numeros: ");
        System.out.println("* 1.- Sumar los numeros.\n* 2.- Restar los numeros.\n* 3.- Multiplicar los numeros.\n* 4.- Dividir los numeros.\n* 5.- Salir del programa.");
        System.out.println("----------------------------------------------------------------");
    }
     
    /**
     * El metodo calcula operacion que el usuario elig y mostra el resultado.
     * @param numeroOperacion
     * @param num1
     * @param num2 
     */
    public static void operaciones(int numeroOperacion, int num1, int num2){
        int resultado = 0;
        
        switch(numeroOperacion){
            case 1: 
                resultado = num1+num2;
                break;
            case 2:
                resultado = num1-num2;
                break;
            case 3:
                resultado = num1*num2;
                break;
            case 4:
                try{
                    resultado = num1/num2;
                }catch(ArithmeticException e){
                    System.out.println("No podemos dividir entre 0;");
                }
                break;
            case 5:
                System.out.println("Has salido de programa.");
                break;
            default: 
                System.out.println("Tienes que elegir un numeros de menu entre 1 y 5!");
        }
       
        //condicional para no imprimir la resultado cuando intentaremos dividir en 0
        if (numeroOperacion != 4 || num2 != 0 ){ 
            System.out.println("EL resultado de la operacion es: " + resultado);
            System.out.println("----------------------------------------------------------------");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroPrimero, numeroSegundo,numeroMenu;
        
        System.out.println("Por favor introduzca un primero numero: ");
        numeroPrimero = pedirNumero();
            
        System.out.println("Por favor introduzca un segundo numero: ");
        numeroSegundo = pedirNumero();
        System.out.println("----------------------------------------------------------------");
        
        do{
          
            System.out.println("Has elegido unos numeros: " + numeroPrimero + " y " + numeroSegundo);
            System.out.println("----------------------------------------------------------------");
            mostrarMenu();
            numeroMenu = pedirNumero();
            operaciones(numeroMenu, numeroPrimero, numeroSegundo);
            
        }while (numeroMenu != 5);
                
    }
    
    
}
