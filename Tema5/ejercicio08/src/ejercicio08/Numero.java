/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author alumno
 */
public class Numero {
    //argunemto
    private int valor;
    
    //constructores
    public Numero(){
        this.valor = 0;
    }
    
    public Numero(int valor){
        this.valor = valor;
    }
    
    //metodos
    //getter y setter
    public int getValor(){
       return this.valor;
    }
    
    public void setValor(int valor){
       this.valor = valor;
    }
    
    
    //toString
    @Override
    public String toString(){
        return "Valor: " + this.valor;
    }
}
