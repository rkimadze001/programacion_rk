/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author alumno
 */
public class Coche {
    //atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    //metodos
    
    //establecerMarca
    public void establecerMarca(String ma){
        marca = ma;
    }
    
    //establecerModelo
    public void establecerModelo(String mo){
        modelo = mo;
    }
    
    //establecerColor
    public void establecerColor(String c){
        color = c;
    }
    
    //arrancarCoche
    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
    }
    
    //apagarCoche
    public void apagarCoche(){
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche(){
        velocidad += 20;
    }   
    
    public void frenarCoche(){
        velocidad -= 6;
    }
    
    //mostrar 
    
    public void obtenerEstado(){
        System.out.println("--Estado de coche---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Motor Encendido: " + motorEncendido);

    }
}
