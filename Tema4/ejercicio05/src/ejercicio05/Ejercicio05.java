/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;
import serPar.SerPar;
import java.util.Scanner;
/**
 * programa: e pida al usuario un número por teclado (en el main). Ese número se
 * lo pasaremos a un método que nos dirá si el número introducido es par o
 * impar.
 * @author RusudanKimadze
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        //crear nuevo instancia de la objeto Scanner y pedir el numero a usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor introduzca un numero: ");
        numero = entrada.nextInt();
        
        //lamamos el metodo serPar en main
        SerPar.serPar(numero);
    }
}
