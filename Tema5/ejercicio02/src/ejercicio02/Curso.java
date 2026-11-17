/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio02;

/**
 *
 * @author ruskakimadze
 */
public class Curso {
    //atributos
    
    private String nombre;
    private int numeroHoras;
    
    //crear atributo estatico
    private static int numeroDeCursos = 0;
    
    //metodos
    public void establecerNombreyHoras(String n, int h){
        nombre = n;
        numeroHoras = h;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerHoras(){
        return numeroHoras;
    }
    
    //metodos estaticos
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static int verNumeroCursos(){
        return numeroDeCursos;
    }
}
