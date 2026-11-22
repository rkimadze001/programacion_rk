/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author ruskakimadze
 */
public class Direccion {
    //atributos
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    
    //constructores
    public Direccion(){
        this.calle = "";
        this.numero = 0;
        this.piso = 0;
        this.ciudad = "";
    }
    
    public Direccion(String calle, int numero, int piso, String ciudad){
        this.calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.ciudad = ciudad;
    }
    
    //metodos
    //setters//getters
    //calle
    public void setCalle(String calle){
        this.calle = calle;
    } 
    
    public String getCalle(){
        return this.calle;
    }
    
    //numero
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    //piso
    public void setPiso(int piso){
        this.piso = piso;
    }
    
    public int getPiso(){
        return this.piso;
    }
    
    //ciudad
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    } 
    
    public String getCiudad(){
        return this.ciudad;
    }
    
    
    //toString
    @Override
    public String toString(){
        return "\n\tCalle: " + this.calle 
              +"\n\tNumero: " + this.numero
                +"\n\tPiso: " + this.piso
                +"\n\tciudad: " + this.ciudad;
    }
    
    
}
