/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author ruskakimadze
 */
public class Triangulo {
    //atributos
    private double cateto1;
    private double cateto2;
    
    //constructores
    public Triangulo(){
        this.cateto1 = 0.0f;
        this.cateto2 = 0.0f;
    }
    
    public Triangulo(double cateto1, double cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    //metodos
    //setters/getters
    public void setCateto1(float cateto1){
        this.cateto1 = cateto1;
    }
    
    public void setCateto2(float cateto2){
        this.cateto2 = cateto2;
    }
    
    public double getCateto1(){
        return this.cateto1;
    }
    
    public double getCateto2(){
        return this.cateto2;
    }
    
    
    //toString
    
    @Override
    public String toString(){
        return "Cateto1: " + this.cateto1 +
                "\n"+ "Cateto2: " + this.cateto2;
    }
}
