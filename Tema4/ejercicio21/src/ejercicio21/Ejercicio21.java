/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
// * Programa: a partir de dos números que nos introduzca el usuario, muestre
 * en pantalla la suma total de todos los números pares comprendidos entre ambos
 * @author RusudanKimadze
 */
public class Ejercicio21 {
    
    
    /**
     * El metodo para pedir el numero a usuario y devolver eso numero
     * @return 
     */
    public static int pedirNumero(){
        int numeroEntrada;
        
       
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        
        return numeroEntrada;
    }
    
    /**
     * El metodo para comprobar si el numero dos es mayor de numero uno y devolva numero dos.
     * @param numUno
     * @param numDos
     * @return 
     */
    public static int comprobarNumeros(int numUno, int numDos){
        while(numDos <= numUno){
            System.out.println("Por favor entra numero que es mayor que primero");
            Scanner entradaDos = new Scanner(System.in);
            numDos = entradaDos.nextInt();
        }
        return numDos;
        
    }
    
    /**
     * El metodo para mostrar la suma de numeros pares entre la primero numero y el ultimo numero.
     * @param primeroNumero
     * @param ultimoNumero 
     */
    public static void mostrarResultado(int primeroNumero, int ultimoNumero){
        int sum = 0;
        for (int i = primeroNumero; i<ultimoNumero; i++){
           if(i % 2 == 0){
               sum += i;
           }        
        }
        
        System.out.println("La suma de numeros pares entre " + primeroNumero + " y " + ultimoNumero + " es: " +sum);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializar variables
         int primeroNumero, ultimoNumero;
         
         //Imprimir mensage y llamar pedirNumero()
         System.out.println("Por favor introduzca el primero numero: ");
         primeroNumero = pedirNumero();
         System.out.println("Ahora introduzca el segundo numero: ");
         ultimoNumero = pedirNumero();
         
         //llamar comprobarNumero() con parametros de numeros entrados a usuario
         ultimoNumero = comprobarNumeros(primeroNumero, ultimoNumero);
         
         //llamar metodo mostrar resultado con atributos
         mostrarResultado (primeroNumero, ultimoNumero);
    }
    
}
