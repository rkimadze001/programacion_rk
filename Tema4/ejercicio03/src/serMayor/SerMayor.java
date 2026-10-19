/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serMayor;

/**
 *
 * @author alumno
 */
public class SerMayor {
    public static void serMayor(int num1, int num2, int num3){
        int numeroMayor;
        if(num1 > num2 && num1 > num3){
            numeroMayor = num1;
        }else if(num2 > num1 && num2 > num3){
            numeroMayor = num2;
        }else {
            numeroMayor = num3;
        }
        
        System.out.println("El número mayor de los introducidos es el: " + numeroMayor);
    }
}
