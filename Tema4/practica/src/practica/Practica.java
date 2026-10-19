/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;
import java.util.Scanner;
import operaciones.Operaciones;

/**
 *
 * @author alumno
 */
public class Practica {
    //imprimir en la plantalla 
    /**
    *Metodo que imprimer por pantalla hola mundo
    */
    public static void saludar(){
        System.out.println("Hola, mundo");
    }
    /**
    * Metodo que pide el usuario en numero entero.
    *
    * @return el numero que escribe el usuario
    */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero: ");
        return entrada.nextInt();
    }
    
    /**
    * Metodo que multiplica dos numeros recibidos por parametros
    *
    * @param num1
    * @param num2
    * @return el numero que escribe el usuario
    */
    public static int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        saludar();
        
        int num1 = pedirNumero();
        int num2 = pedirNumero();
        
        int resultado = multiplicar(num1, num2);
        
        System.out.println("el resultado es: " + resultado);
        System.out.println(multiplicar(pedirNumero(),pedirNumero()));
        
        
        //llamo al metodo sumar() de la clase Operaciones que esta en el paquete operaciones
        Operaciones.sumar(num1, num2);
        
    }
    
}
