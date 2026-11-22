/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author ruskakimadze
 */
public class Saludo {
    //atributo
    private String frase;
    
    //constructores
    public Saludo(){
        this.frase = "";
    }
    
    public Saludo(String frase){
        this.frase = frase;
    }
    
    //metodos
    //setter//getter
    public void setFrase(String frase){
        this.frase = frase;
    }
    
    public String getFrase(){
        return this.frase;
    }
    
    //toString
    @Override
    public String toString(){
        return "Frase: " + frase;
    }
}
