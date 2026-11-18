/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Test {
    
    public static int pedirNumero(){
        System.out.println("Por favor introduza un numero: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
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
      
      comprobarNumero(num1);
      
   }
}
