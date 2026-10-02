/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;
import java.util.Scanner;
/**
 * Programa que dado un importe en euros nos indique número óptimo de billetes 
 * de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y de 1 euro.
 * @author RusudanKimadze
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int dineroEntrado, billeteCincuenta, billeteVeinte,
                billeteDiez, billeteCinco, monedaUno, monedaDos;
        
        //entrada de usuario 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, indique una candidad de dinero: ");
        dineroEntrado = entrada.nextInt();
        
        //calculacion
        billeteCincuenta = (dineroEntrado)/50;
        billeteVeinte = (dineroEntrado%50)/20;
        billeteDiez = (dineroEntrado%50%20)/10;
        billeteCinco = (dineroEntrado%50%20%10)/5;
        monedaDos = (dineroEntrado%50%20%10%5)/2;
        monedaUno = dineroEntrado%50%20%10%5%2;
        
        //imprimir en plantalla
        System.out.println(dineroEntrado + " Euros se descomponen en " + billeteCincuenta +
                " billetes de 50, " + billeteVeinte + " billetes de 20, " + billeteDiez + " billetes de 10, \n"  
                + billeteCinco + " billetes de 5, " + monedaDos + " monedas de 2 euros y " + monedaUno + 
                " monedas de 1 euro.");
    }
    
}
