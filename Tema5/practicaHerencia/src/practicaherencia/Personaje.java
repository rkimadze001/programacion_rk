/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package practicaherencia;

/**
 *
 * @author ruskakimadze
 */
public class Personaje {
    //atributos
    private int vida;
    
    //constructores
    public Personaje(){
        this.vida = 100;
    }
    
    public Personaje(int vida){
        this.vida = vida;
    }
    //metodos
    //getters y setters
    public int getVida(){
        return this.vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    //toString
    @Override 
    public String toString(){
        return "El personaje tiene " + vida +"% de vida.";
    }
}
