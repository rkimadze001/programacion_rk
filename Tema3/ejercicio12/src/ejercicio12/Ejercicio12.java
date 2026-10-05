/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 * Programa: imprima los números pares que existen entre el número 11 y el
 * número 133.
 * @author RusudanKimadze
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declarar y inisializar variable
        int num = 11;
        
        //imprimir numeros entre 11 a 133 si esos numeros son pares
        do{
            if(num%2 == 0){
                System.out.println(num);
            }
            num++;
        }while(num < 133);
    }
    
}
