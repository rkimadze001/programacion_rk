/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practicaherencia;

/**
 *
 * @author ruskakimadze
 */
public class Jugador extends Personaje {
    //atributos
    private String habilidad;
    
    //constructores
    public Jugador(){
        super();
        this.habilidad = "";
    }
    
    public Jugador(int vida, String habilidad){
        super(vida);
        this.habilidad = habilidad;
    }
    
    //metodos
    //getters y setters
    public String getHabilidad(){
        return this.habilidad;
    }
    
    public void setHabilidad(String habilidad){
        this.habilidad = habilidad;
    }
    
    public void mejorarHabilidad(String habilidad){
        System.out.println("Mejorar la habilidad " + this.habilidad + "...");
    }
    //toString
    
    @Override
    public String toString(){
        return super.toString() + " y  es un JUGADOR con habilidad de " + this.habilidad;
    }
}