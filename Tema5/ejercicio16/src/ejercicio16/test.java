/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa: donde el usuario
 * introduzca el nombre y la nota de un alumno (número entero entre 0 y 10 y se
 * escribirá su calificación según el valor de la nota ingresada
 * @author RusudanKimadze
 */
public class test {
    /**
     * El metodo para pedir la nota al usuario y devolver este valor, tambien comprobar si valor es entre 0 y 10
     * @return 
     */
    public static int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        boolean esValida = false;
        
        //bucle para comprobar si valor entrada es enrtre 0 y 10 y pedir hacta que el usuario entra numero correcta.
        do{
            System.out.print("Ahora, introduzca su nota: ");
            
            try{
                nota = entrada.nextInt();
                if(nota >= 0 && nota <= 10){
                    esValida = true;
                }else{
                    System.out.println("Upss Error!!! Entra un numero entre 0 y 10.");
                }
               
            }catch(InputMismatchException e){
                System.out.println("Por favor introduza un numero");
                entrada.nextLine();
            }  
        }while(!esValida);
        
       
        return nota;
    }
    
    /**
     * El metodo para pedir el nombre al usuario y devolver este nombre
     * @return 
     */
    public static String pedirNombre(){
        System.out.print("Introducza el nombre de alumno: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    /**
     * El metodo se pasa objeto y mostrar resultado depende de valor de este resultado.
     * @param alumno 
     */
    public static void mostrarResultado(Alumno alumno){
        System.out.println("================================");
        System.out.println(alumno);
        System.out.println("Resultado de la evaluation es: ");
        switch(alumno.getNota()){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.print("Suspenso.");
                break;
            case 5:
            case 6:
                System.out.print("Bien.");
                break;
            case 7:
            case 8:
                System.out.print("Notable.");
                break;
            case 9:
            case 10:
                System.out.print("Sobresaliente.");
                break;
            default:
                System.out.print("Entra una nota correcta!");
        }
        System.out.println("\n================================");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear tres objetos de la clase Alumno
        
        System.out.println("Alumno 1: ");
        System.out.println("================================");

        Alumno alumno1 = new Alumno(pedirNombre(), pedirNota());
        mostrarResultado(alumno1);

        System.out.println("Alumno 2: ");
        System.out.println("================================");
        Alumno alumno2 = new Alumno(pedirNombre(), pedirNota());
        mostrarResultado(alumno2);

        System.out.println("Alumno 3: ");
        System.out.println("================================");
        Alumno alumno3 = new Alumno(pedirNombre(), pedirNota());
        mostrarResultado(alumno3);
        
        
    }
    
}
