/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ruskakimadze
 */
public class Test {
    
    public static void main(String[] args) {
        //crear objetos
        Curso curso1 = new Curso();
        Curso.sumarCursos();
        
        Curso curso2 = new Curso();
        Curso.sumarCursos();
        
        //establecer nombre y el numero de horas de objetos
        curso1.establecerNombreyHoras("Programacion", 20);
        curso2.establecerNombreyHoras("Bases de datos", 15);
        
        
        //mostrar los datos de coursos
        System.out.println("------------------------------------------");
        //curso1
        System.out.println("Curso 1:");
        System.out.println("Nombre: " + curso1.obtenerNombre() + "\n"+ 
                "El numero de horas: " + curso1.obtenerHoras());
        
        System.out.println("------------------------------------------");
        
        //curso2
        System.out.println("Curso 2:");
        System.out.println("Nombre: " + curso2.obtenerNombre() + "\n"+ 
                "El numero de horas: " + curso2.obtenerHoras());
        
        System.out.println("------------------------------------------");
        
        //mostrar numeros de cursos
        System.out.println("El numero de cursos creados: " + Curso.verNumeroCursos());
    }
}
