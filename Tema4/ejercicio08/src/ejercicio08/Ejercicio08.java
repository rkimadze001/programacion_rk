/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

import java.util.Scanner;

/**
 * Programa: dado un importe en euros (en el main) se
 * los pase a un método que nos indique número óptimo de billetes de 50, 20, 10 y 5,
 * así como la cantidad sobrante en monedas de 2 y de 1 euro. En caso de que NO
 * haya billetes/monedas de algún tipo NO se mostrarán.
 * @author Rusudan Kimadze
 */
public class Ejercicio08 {
    /**
     * El metodo indique número óptimo de billetes de 50, 20, 10 y 5.
     * @param cantidadDeDinero 
     */
    public static void serOprimalBillete(int cantidadDeDinero){
        //declarar vairables
        int billeteCincuenta, billeteVeinte, billeteDiez, billeteCinco,
                monedaDos, monedaUno;
        
        //inicial mensage
        System.out.println(cantidadDeDinero + " Euros se descomponen en: ");
        
        //condicionals
        
        //billete 50
        billeteCincuenta = cantidadDeDinero/50;
        if(billeteCincuenta > 0){
            System.out.println("Billetes de 50: " + billeteCincuenta);
        }
        
        //billete 20
        billeteVeinte = (cantidadDeDinero % 50)/20;
        if(billeteVeinte > 0){
            System.out.println("Billetes de 20: " + billeteVeinte);
        }
        
        //billete 10
        billeteDiez = (cantidadDeDinero % 50 % 20)/10;
        if(billeteDiez > 0){
            System.out.println("Billetes de 10: " + billeteDiez);
        }
         
        //billete 5
        billeteCinco = (cantidadDeDinero % 50 % 20 % 10)/5;
        if(billeteCinco > 0){
            System.out.println("Billetes de 5: " + billeteDiez);
        }
        
        //moneda 2
        monedaDos = (cantidadDeDinero % 50 % 20 % 10 % 5)/2;
        if(monedaDos > 0){
            System.out.println("Moneda de 2: " + monedaDos);
        }
        
         //moneda 1
        monedaUno = cantidadDeDinero % 50 % 20 % 10 % 5 % 2;
        if(monedaUno > 0){
            System.out.println("Moneda de 1: " + monedaUno);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadEntrada;
        
        Scanner entrada = new Scanner(System.in);
        
        //pedir candidad de dinero a usuario
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        cantidadEntrada = entrada.nextInt();
        
        //llamar metodo serOprimalBillete en main
        serOprimalBillete(cantidadEntrada);
    }
    
}
