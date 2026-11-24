/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author ruskakimadze
 */
public class Empleado {
   //atributos
    private String nombre;
    private int horas;
    private double tarifa;

    //constructores

    public Empleado(){
        this.nombre = "";
        this.horas = 0;
        this.tarifa = 0.0;  
    }

    public Empleado(String nombre, int horas, double tarifa){
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }

    //metodos
    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setHoras(int horas){
        this.horas = horas;
    }

    public void setTarifa(double tarifa){
        this.tarifa = tarifa;
    }

    //getters
    public String getNombre(){
        return this.nombre;
    }

    public int getHoras(){
        return this.horas;
    }

    public double getTarifa(){
        return this.tarifa;
    }

    //toString
    @Override
    public String toString(){
    return "Nombre: " + this.nombre + ", horas: " + this.horas + ", tarifa: " + this.tarifa;
    }
}
