/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 * Programa: Desarrolle una aplicación en Java que determine el sueldo bruto para
 * cada uno de los tres empleados de una empresa La empresa paga la tarifa normal
 * en las primeras 40 horas de trabajo de cada empleado, y paga tarifa y media en
 * todas las horas trabajadas que excedan de 40
 * @author RusudanKimadze
 */
public class Ejercicio19 {
   
    /**
     * El metodo para pedir al usuario los datos de un empleado y crear el objeto
     * @return el empleado creado
     */
    public static Empleado crearEmpleado(){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el nombre del empleado: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Introduzca el numero de horas que trabajo: ");
        int horas = entrada.nextInt();
        
        System.out.println("Introduzca la tarifa por hora: ");
        double tarifa = entrada.nextDouble();
        entrada.nextLine(); //para limpiar el buffer
        
        return new Empleado(nombre, horas, tarifa);
    }
    
    /**
     * El metodo para determinar y mostrar el sueldo bruto de un empleado
     * @param empleado
     */
    public static void mostrarSueldo(Empleado empleado){
        int horas = empleado.getHoras();
        double tarifa = empleado.getTarifa();
        double sueldo;
        
        //las primeras 40 horas con tarifa normal, las horas extra con tarifa y media
        if(horas <= 40){
            sueldo = horas * tarifa;
        }else{
            int horasExtra = horas - 40;
            sueldo = (40 * tarifa) + (horasExtra * tarifa * 1.5);
        }

        System.out.println(empleado.getNombre() + " trabajo " + empleado.getHoras()
                + " horas, cobra " + empleado.getTarifa()
                + " euros la hora por lo que le corresponde un sueldo de " + sueldo + " euros.");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("--- Datos del primer empleado ---");
        Empleado empleado1 = crearEmpleado();

        System.out.println("--- Datos del segundo empleado ---");
        Empleado empleado2 = crearEmpleado();

        System.out.println("--- Datos del tercer empleado ---");
        Empleado empleado3 = crearEmpleado();

        System.out.println();
        mostrarSueldo(empleado1);
        mostrarSueldo(empleado2);
        mostrarSueldo(empleado3);
    }
    
}
