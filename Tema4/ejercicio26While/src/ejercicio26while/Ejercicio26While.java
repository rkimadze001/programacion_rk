/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26while;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio26While {
    
     /**
     * El metodo para pedir el numero a usuario y devolver esto valor 
     * @return 
     */
    public static int pedirNumero(){
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        
        return numero;
    }
    
    /**
     * El metodo comproba si es valor es primo o no y devolva boolean valor
     * @param numero
     * @return 
     */
    public static boolean esPrimo(int numero){
        boolean esPrimo = false;
    
        int divisor = 2;
        
        //bucle para comprobar cuantos divisores tiene el numero 
        //for(int i = 1; i<numero; i++){
        //    if (numero % i == 0){
          //      cont++;
        //    }
        //}
        while(divisor < numero &&  !esPrimo){
             if(numero % divisor == 0){
                esPrimo = true;    
             }
             divisor++;  
        }
        //condicional para devolver true si numero tiene solamente uno divisor
       
        return esPrimo;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        boolean esPrimo;
        
        System.out.println("Introduzca un numero: ");
        numero = pedirNumero();
       
        esPrimo = esPrimo(numero);
        
        //mostrar resultado depende a la resultado metodo esPrimo()
        if(esPrimo){
            System.out.println("Numero " + numero + " es primo.");
        }else{
            System.out.println("Numero " + numero + " no es primo.");
        }
    }
    
}
