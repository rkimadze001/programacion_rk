/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author ruskakimadze
 */
public class Empleado {
    //atributos
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //constructores
    public Empleado(){
        this.nombre = "";
        this.salario = 0;
        this.direccion = new Direccion();
    }
    
    public Empleado(String nombre, int salario, Direccion direccion){
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }
    
    //metodos 
    //settert // getters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public void setSalario(int salario){
        this.salario = salario;
    }
    
    public int getSalario(){
        return this.salario;
    }
    
    
    public void setDireccion(Direccion direccion){
        this.direccion = direccion;
    }
    public Direccion getDireccion(){
        return this.direccion;
    }
    
    //toString
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre +
                "\nSalario: " + this.salario +
                "\nDireccion: " + this.direccion;
    }   
}
