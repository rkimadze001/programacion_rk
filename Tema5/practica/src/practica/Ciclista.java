/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author alumno
 */
public class Ciclista {
    // Atributos
    private String nombre;
    private int dorsal;
    
    //constructores
    //por defecto
    public Ciclista(){
        this.nombre = "";
        this.dorsal = 0;
    }
    
    //parametrizado
    public Ciclista(String nombre, int dorsal){
        this.nombre = nombre;
        this.dorsal = dorsal;
    }
    
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getDorsal(){
        return dorsal;
    }
    public void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }
    
    //metodos
    
    //to String
    @Override
    public String toString(){
     return "Nombre " + this.nombre + " ("+ this.dorsal;
    } 
    
}
