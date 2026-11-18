/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio09;

/**
 *
 * @author alumno
 */
public class Numero {
    //atributo
    private int valor;
    
    //constructores
    public Numero(){
        this.valor = 0;
    }
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    //metodos 
    //getters y setters
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    //toString
    @Override
    public String toString(){
        return "valor: " + this.valor;
    }
}
