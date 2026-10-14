/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**
 * Programa: calcule la edad de una persona, solicitando la fecha actual y la fecha de su nacimiento.
 * @author RusudanKimadze
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaracion de variables
        int anioActual, anioNacimiento, mesActual, mesNacimiento, 
            diaActual, diaNacimiento,
            anios= 0, meses = 0, dias;
        
        //nuebo instancia de objecto scanner
        Scanner entrada = new Scanner(System.in);
        
        //entrada de usuario (actuales)
        System.out.print("Introduzca el año actual: ");
        anioActual = entrada.nextInt();
        System.out.print("Introduzca el mes actual: ");
        mesActual = entrada.nextInt();
        System.out.print("Introduzca el dia actual: ");
        diaActual = entrada.nextInt();
        
        //entrada de usuario (nacimientos)
        System.out.print("Ahora, introduzca su año de nacimiento: ");
        anioNacimiento = entrada.nextInt();
        System.out.print("Ahora, introduzca su mes de nacimiento: ");
        mesNacimiento = entrada.nextInt();
        System.out.print("Ahora, introduzca su dia de nacimiento: ");
        diaNacimiento = entrada.nextInt();

        
        //calculaciones con condicionales
        if(diaActual >= diaNacimiento){
            dias = diaActual - diaNacimiento;
        }else {
            mesActual --;
            dias = (30 + diaActual) - diaNacimiento;      
        }
        
        if(mesActual >= mesNacimiento){
            meses = mesActual - mesNacimiento;
        }else {
            anioActual --;
            meses = (12 + mesActual) - mesNacimiento;        
        }
        
        anios = anioActual - anioNacimiento;
       
        //imprimir en plantlla
        System.out.println("Su edad exacta es de "+anios +" años, "+meses +" meses y "+ dias+ " días.");
        
    }  
}
 