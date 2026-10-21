/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 * Programa: imprima todos los números múltiplos de 3 que existen entre el
 * número 1 y otro número introducido por el usuario.
 * @author RusudanKimadze
 */
public class Ejercicio14 {

    /**
     * El metodo pedir numero a usuario y revolver esto numero
     * @return 
     */
    public static int pedirNumero(){
        int numeroEntrado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero mayor de 1: ");
        numeroEntrado = entrada.nextInt();  
        return numeroEntrado;
    }
    
    /**
     * El metodo revolver si el numero es mayor de 1 o no, revolva true en caso que es          * mayor y false en caso contrario. 
     * @param numero
     * @return 
     */
    public static boolean esMayor(int numero){
        return numero > 0;
    }
    
    /**
     * El metodo con muestra todo los numeros multiplos entre 1 y numero entrado.
     * @param numero 
     */
    public static void mostrarResultado(int numero){
        int cont = 0;
        System.out.println("Los numeros multiplos de 3 entre 1 y " + numero + " son: ");
        for (int i = 1; i < numero; i ++){
            if(i % 3== 0){
                System.out.print("- " + i + " ");
                cont++;
            }
        }
        System.out.println("\nTotal numeros mostrados son: " + cont);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroEntrado;
        boolean mayor;
        
        do {
            numeroEntrado = pedirNumero();
            mayor = esMayor(numeroEntrado);
            if(mayor){
                mostrarResultado(numeroEntrado);
            }else{
                System.out.println("Error! por favor entra un numero mas de 0!");
            }
        }while(numeroEntrado < 1);
    }
    
}
