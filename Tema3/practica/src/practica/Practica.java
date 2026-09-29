/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author alumno
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 9;
        
        if(num1 % 2== 0){
            System.out.println("El numbero es par.");
        }
        
        if(num1 % 2== 0){
            System.out.println("El numbero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
        
        if(num1 > 0){
            System.out.println("El numero es positivo");
        } else if(num1 <0){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0.");
        }
        
        switch (num1) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No existe ese dia de la semana.");
        }
        // TODO code application logic here
    }
    
}
