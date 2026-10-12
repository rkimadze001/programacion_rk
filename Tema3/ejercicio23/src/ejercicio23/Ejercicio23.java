/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;
import java.util.Scanner;

/**
 * Programa: imprima todos los números existentes entre el número 1 y otro
 * introducido por el usuario tambien ontrola que el usuario te meta un número mayor
 * que 1 y, sino, avísale del error y vuélveselo a pedir las veces que hagan
 * falta. (hasta que introduzca un número mayor que 1)
 * @author RusudanKimadze
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaral y inicializar variables
        int numeroPrimero = 1;
        int numeroUltimo;
        
        //pedir numeroUltimo de usuario
        Scanner entrada = new Scanner(System.in);
        
        //bucle para combrobar entrada de usuario
        do{
            System.out.println("Por favor entra el numero mas de 1:");
            numeroUltimo = entrada.nextInt();
            if(numeroUltimo <= numeroPrimero){
                System.out.print("Ups error!!! ");
            }
        } while(numeroUltimo <= numeroPrimero);
        
    
        //bucle para imprimir todos los numeros entre numeroPrimero y numeroUltimo
        System.out.println("Los numeros entre de 1 y " + numeroUltimo + " son: ");
        for(int i = numeroPrimero; i < numeroUltimo; i++){
            System.out.print(i + " - ");
        }
    }
}
