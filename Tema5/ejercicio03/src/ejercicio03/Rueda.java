/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public class Rueda {
    //atributos
    private String material;
    private int pulgadas;
    
    
    //metodos
    public void establecerMaterial(String material){
        this.material = material;
    }
    
    public void establecerPulgadas(int pulgadas){
        this.pulgadas = pulgadas;
    }
    
    public String obtenerMaterial(){
        return material;
    }
    
    public int obtenerPulgadas(){
        return pulgadas;
    }
   
    @Override
    public String toString(){
        return "Material: " + this.material + " || " + "Pulgadas: " + this.pulgadas;
    }
}
