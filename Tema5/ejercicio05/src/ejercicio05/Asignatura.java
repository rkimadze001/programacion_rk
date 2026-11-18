/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author alumno
 */
public class Asignatura {
    //atributos
    private String nombre;
    private float nota;  
   
    //estatic variable
    private static int notaCandidad = 0;
    //contructor
    //por defecto
    public Asignatura (){
        this.nombre = "";
        this.nota = 0.0f;
    }
    
    public Asignatura(String nombre, float nota){
        this.nombre = nombre;
        this.nota = 0.0f;
    }
    
    //metodos
    //setter y getter
    public void setNota(float nota){
        this.nota = nota;
    }
    
    public float getNota(){
        return this.nota;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    //metodos estaticos
    public static void contarCandidadDeNota(){
        notaCandidad++;
    }   
    
    public static int mostrarCandidadDeNota(){
        return notaCandidad;
    }  
    
    @Override
    public String toString(){
        return "Nombre de asignatura: " + this.nombre + ".\n"
               +"nota de asignatura: " + this.nota;
    }
}
