/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serMayor;

/**
 *
 * @author Rusudan Kimadze
 */
public class SerMayor {
    /**
     * El metodo comproba cual es la mayor numero entre tres numeros y imprima en la pantalla.
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void serMayor(int num1, int num2, int num3){
        //declarar variables
        int numeroMayor;
        //condicionales para comprobar cual es el numero mayor
        if(num1 > num2 && num1 > num3){
            numeroMayor = num1;
        }else if(num2 > num1 && num2 > num3){
            numeroMayor = num2;
        }else {
            numeroMayor = num3;
        }
        //imprimir resultado en la pantalla
        System.out.println("El número mayor de los introducidos es el: " + numeroMayor);
    }
}
