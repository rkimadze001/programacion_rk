/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio16;

/**
 *
 * @author ruskakimadze
 */
public class Alumno {
    //atributos
    private String nombre;
    private int nota;
    
    //constructores
    public Alumno(){
        this.nombre = "";
        this.nota = 0;
    }
    
    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    //metodos
    //setter // getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNota(int nota){
        this.nota = nota;
    }
    
    public int getNota(){
        return this.nota;
    }
    
    //toString
    @Override
    public String toString(){
        return "Nombre: " + this.nombre
                +"\nNota: " + this.nota;
    }
    
    
}
