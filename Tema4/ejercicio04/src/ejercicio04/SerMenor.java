/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author RusudanKimadze
 */
public class SerMenor {
    /**
     * El metodo comproba tres numeros y eliga la menor y imprima resulta en la pantalla.
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void serMenor(int num1, int num2, int num3){
        //declarar variable
        int numeroMenor;
        //condicionales para comprobar cual es el numero menor
        if(num1 < num2 && num1 < num3){
            numeroMenor = num1;
        }else if(num2 < num1 && num2 < num3){
            numeroMenor = num2;
        }else {
            numeroMenor = num3;
        }
        //imprimir en la patalla
        System.out.println("El número menor de los introducidos es el: " + numeroMenor);
    }
}
