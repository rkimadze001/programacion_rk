/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author alumno
 */
public class SerMenor {
    public static void serMenor(int num1, int num2, int num3){
        int numeroMenor;
        if(num1 < num2 && num1 < num3){
            numeroMenor = num1;
        }else if(num2 < num1 && num2 < num3){
            numeroMenor = num2;
        }else {
            numeroMenor = num3;
        }
        
        System.out.println("El número menor de los introducidos es el: " + numeroMenor);
    }
}
