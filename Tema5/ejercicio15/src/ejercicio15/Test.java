/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 * Programa: Diseña una clase Dirección con los atributos calle, número, piso y ciudad A
 * continuación, diseña una clase Empleado con los atributos nombre (de tipo String salario (de tipo
 * int y dirección (de tipo Dirección)
 * @author RusudanKimadze
 */
public class Test {
    /**
     * El metodo para mostrar informacion de empleado
     * @param emp 
     */
    public static void mostrarInformacion(Empleado emp){
        System.out.println(emp.toString());
    }
    
    public static void main(String[] args) {
         
        //crear 3 objetos de clase direccion
        Direccion dir1 = new Direccion("Gran Via", 15, 20, "Madrid");
        Direccion dir2 = new Direccion("Calle Alcalá", 10, 25, "Madrid");
        Direccion dir3 = new Direccion("Passeig de Gràcia", 2, 25, "Barcelona");
        
        
        //crear tres objetos de clase empleado
        Empleado emp1 = new Empleado("Anna", 2000, dir1);
        Empleado emp2 = new Empleado("Luka", 1800, dir2);
        Empleado emp3 = new Empleado("Lea", 3200, dir3);
        
        
        //llamar metodos para mostrar informacion sobre empleado
        System.out.println("Empleado 1: ");
        System.out.println("==============================");
        mostrarInformacion(emp1);
        
        System.out.println("==============================");
        System.out.println("Empleado 2: ");
        mostrarInformacion(emp2);
        
        System.out.println("==============================");        
        System.out.println("Empleado 3: ");
        mostrarInformacion(emp3);

    }
}
