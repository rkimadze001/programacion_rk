/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio31;

/**
 * Programa: genere números enteros aleatorios entre 1 y 100 hasta obtener 3 números impares.
 * @author RusudanKimadze
 */
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaracion y inisializacion de variables
        int cont = 0, candidadDeValores = 0;      
        
        //muestra en plantalla
        System.out.print("Primero tres numeros impares son: ");
        
        //bucle para imprimir numeros
        while(cont != 3){
            // generar aleatorio numero 
            double aleatorio = Math.floor(Math.random() * 100 + 1);
            
            //converter double a int
            int altearioInteger = (int)aleatorio;
        
            if(altearioInteger % 2 != 0){
                System.out.print(altearioInteger + " - ");
                cont ++;
            }
            candidadDeValores ++;
        }
        
        System.out.println("\nCandidad de valores han sido necesario: " + candidadDeValores);
    }
    
}
