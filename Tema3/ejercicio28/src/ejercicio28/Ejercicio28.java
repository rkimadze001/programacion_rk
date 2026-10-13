/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio28;

/**
 * Programa: genere un número aleatorio (utiliza Math.random() ) entre 1 y 100,
 * que lo muestre por pantalla e indique si es par o impar.
 * @author RusudanKimadze
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar y inicializar variables
        double aleatorio = Math.floor(Math.random()*100 + 1); 
        
        //convertir double a integer (casting)
        int aleatorioEntero = (int)aleatorio;
        
        //imprimir en plantalla si es impar o par
        System.out.print("El numero aleatorio es: " + aleatorioEntero + ". ");
        if(aleatorioEntero % 2 == 0){
            System.out.print("El numero es par.");
        }else{
            System.out.print("El numero es impar.");
        }
        
    }
    
}
