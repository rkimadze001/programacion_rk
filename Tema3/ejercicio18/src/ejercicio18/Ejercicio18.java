/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 * Programa: e pida una contraseña al usuario. Si la escribe bien le dará la
 * enhorabuena, pero si la escribe mal 3 veces le dará un mensaje de error de
 * acceso.
 * @author RusudanKimadze
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contrasenia = 3982;
        int contraseniaEntrada, count = 0;
        Scanner entrada = new Scanner(System.in);
        
        //bucle para calcular y imprimir textos a usuario  
        do{
          System.out.println("Por favor entra tu contrasenia aqui: ");
          contraseniaEntrada = entrada.nextInt();
          if(contraseniaEntrada == contrasenia){
              System.out.println("Enhorabuena!");
              break;
          }else{
              System.out.println("(Pista 4 digits) ");
              count++; 
          }
          
         if(count == 3){
             System.out.println("error de acceso.");
         }
        }while(count < 3);
    }
    
}
