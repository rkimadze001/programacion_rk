/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 * Programa: con clase llamada Numero que
 * contendrá un único atributo privado, llamado valor, de tipo
 * entero.
 * @author Rusudan Kimadze
 */
public class Test {
    /**
     * El metodo para pedir un numero a usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        System.out.println("Por favor, introduzca un numero: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo para comprobar si el numero es par o impar y imprimir el 
     * resultado en la pantalla.
     * @param numero 
     */
    public static void comprobarNumero(Numero numero){
        if(numero.getValor()%2 == 0){
            System.out.println("Numero es par!");
        }else{
            System.out.println("Numero es impar!");
        }
        
    }
   
    public static void main(String[] args){
      int numeroEntrada;
      
      numeroEntrada = pedirNumero();
      
      //crear objeto
      Numero num1 = new Numero(numeroEntrada);
      
      //llamar el metodo comprobarNumero() con argumento num1
      comprobarNumero(num1);
      
   }
}
