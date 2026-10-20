/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 * programa: utilizando bucles,
 * imprima la tabla de multiplicar de un número que elija el usuario. El
 * número se pedirá en un método y la tabla de multiplicar se escribirá
 * en otro.
 * @author RusudanKimadze
 */
public class Ejercicio10 {
    
    /**
     * El metodo para pedir y return el numero entrada de usuario
     * @return 
     */
    public static int pedirNumero(){
        int numeroEntrada;
                
        Scanner entrada = new Scanner(System.in);
        numeroEntrada = entrada.nextInt();
        
        return numeroEntrada;
            
    }
    
    public static void tablaMultiplicar(int numero){        
        for(int i=0; i < 10; i++ ){
            System.out.println(numero + 'x'+ i);
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
}
