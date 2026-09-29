/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio29;
import java.util.Scanner;
/**
 * Programa: le pida al usario que introduzca la longitud de los catetos de un triangulo 
 * y calcule el cuadrato de la longitud de la hipotenusa.
 * @author RusudanKimadze
 */
public class Ejercicio29 {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       double longitudDeCateto1, longitudDeCateto2, longitudDeHipotenusaCuadrato;
       
       Scanner entrada = new Scanner(System.in);
       
       //escribir en la pantalla para que solicitar valoridad de usuario
       System.out.println("Introduce la longitud de el cateto 1: ");
       longitudDeCateto1 = entrada.nextDouble();
       System.out.println("Introduce la longitud de el cateto 2: ");
       longitudDeCateto2 = entrada.nextDouble();

       
       //calcular de el cuadrato de la hipotenusa
       longitudDeHipotenusaCuadrato = longitudDeCateto1 * longitudDeCateto1 + longitudDeCateto2* longitudDeCateto2;
       
       System.out.println("El cuadrado de la hipotenusa es: " + longitudDeHipotenusaCuadrato);
    }
    
}
