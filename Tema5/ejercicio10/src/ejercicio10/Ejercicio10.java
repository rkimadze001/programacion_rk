/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;
import java.util.Scanner;
/**
 * Programa: en el que el usuario introduzca cuatro números
 * enteros y luego el programa los muestre por pantalla
 * ordenados de forma creciente ..(de menor a mayor)
 * @author ruskakimadze
 */
public class Ejercicio10 {
    /**
     * El metodo para pedir un numero al usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo pasa cuatro instancias de clase Numero por referencia
     * y cambia valores hasta que los valores son ordenadas
     * de menor a mayor.
     * @param num1
     * @param num2
     * @param num3
     * @param num4 
     */
    public static void ordenarNumeros(Numero num1, Numero num2, Numero num3, Numero num4){
        int aux;
        //trec iteraciones de comprobar dos numeros y cambiar si no estan en citios correctos.
        for(int i=0; i<3; i++){
            if(num1.getValor()>num2.getValor()){
               aux = num2.getValor();
               num2.setValor(num1.getValor());
               num1.setValor(aux);
                 
            }
            if(num2.getValor()>num3.getValor()){
               aux = num3.getValor();
               num3.setValor(num2.getValor());
               num2.setValor(aux);
                 
            }
            if(num3.getValor()>num4.getValor()){
               aux = num4.getValor();
               num4.setValor(num3.getValor());
               num3.setValor(aux);
                 
            }
        }      
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Por favor, introduzca cuatro numeros: ");
        
        //pedir numeros a usuario y crear cuatro objetos de clase Numero
        System.out.println("Primero: ");
        Numero num1 = new Numero(pedirNumero());
        
        System.out.println("Segundo: ");
        Numero num2 = new Numero(pedirNumero());
        
        System.out.println("Tercero: ");
        Numero num3 = new Numero(pedirNumero());
        
        System.out.println("Cuarto: ");
        Numero num4 = new Numero(pedirNumero());
        
        //llamar el metodo para ordenar numeros y imprimir resultado en pantalla
        ordenarNumeros(num1, num2, num3, num4);
        System.out.println("Los numeros ordenadas de menor a mayor son: " + num1.getValor() + " - " 
                            + num2.getValor() + " - " + num3.getValor()
                                             + " - " + num4.getValor());
    }
    
}
