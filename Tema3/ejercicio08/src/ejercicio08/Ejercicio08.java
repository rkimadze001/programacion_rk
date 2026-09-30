/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import java.util.Scanner;
/**
 * Programa: dado un importe en euros nos indique número óptimo de billetes de
 * 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y de 1 euro.
 * @author RusudanKimadze
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dineroEntrada;
        int monedaDeUna, monedaDeDos, billeteCinco, billeteDiez, 
                billeteVeinte, billeteCincuenta;
        
        Scanner entrada = new Scanner (System.in);
        //entrada
        System.out.println("Por favor, indique una cantidad de dinero: ");
        dineroEntrada = entrada.nextInt();
        
        //condiciones
        
        //billete 50 
        if(dineroEntrada/50 != 0){
           billeteCincuenta = dineroEntrada/50;
            System.out.println("Billetes de 50: " + billeteCincuenta);
        }
        //billete 20
        if((dineroEntrada%50)/20 != 0){
           billeteVeinte = (dineroEntrada%50)/20;
            System.out.println("Billetes de 20: " + billeteVeinte);
        }
        //billete 10 
        if((dineroEntrada%50)%20/10 != 0){
           billeteDiez = (dineroEntrada%50)%20/10;
            System.out.println("Billetes de 10: " + billeteDiez);
        }
        //billete 5
        if((dineroEntrada%50%20%10)/5 != 0){
            billeteCinco = dineroEntrada%50%20%10/5;
            System.out.println("Billetes de 5: " + billeteCinco);
        }
        //moneda 2
         if((dineroEntrada%50%20%10%5)/2 != 0){
            monedaDeDos = dineroEntrada%50%20%10%5/2;
            System.out.println("Monedas de 2 euros: " + monedaDeDos);
         } 
        //moneda 1
        if((dineroEntrada%50%20%10%5%2) != 0){
           monedaDeUna = dineroEntrada%50%20%10%5%2;
           System.out.println("Monedas de 1 euros: " + monedaDeUna);
        }

}
}

