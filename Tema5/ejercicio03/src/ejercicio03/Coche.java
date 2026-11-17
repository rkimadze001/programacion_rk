/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public class Coche {
    //atributos
    
    private String marca;
    private String modelo;
    private Rueda ruedas;
    
    
    //metodos
    public void establecerMarca(String marca){
        this.marca = marca;
    }
    
    public void establecerModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public String obtenerModelo(){
        return modelo;
    }
    
    public void esrablecerRueda(Rueda rueda){
        this.ruedas = rueda;
    }
    
    public Rueda obtenerRueda(){
        return ruedas;
    }
}
