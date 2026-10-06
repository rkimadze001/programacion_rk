/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 * Programa: imprima los números impares que existen entre los números 20 y el
 * 160. Además, al final, nos dirá cuantos impares ha imprimido en total por
 * pantalla. 
 * @author RusudanKimadze
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables 
        int primeroNumero = 20,
                ultimoNumero = 160;
        int counter=0;
        
        //imprimir en la plantalla, empezar mensaje:
        System.out.println("Los números impares existentes entre el número 20 y el 160 son: ");
       
        //con bucle imprimir otro parte de mensaje
        while(primeroNumero < ultimoNumero){
            if(primeroNumero%2 != 0){
                System.out.print( primeroNumero + "-");
                counter++;
                }
            primeroNumero++;
        }
        
        //imprimir ultimo parte de mensaje
        System.out.println("\nLa cantidad de números impares impresos han sido: " + counter);
    }
    
}
