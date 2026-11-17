/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author alumno
 */
public class Bicicleta {
    //atributos
    private String marca;
    private String color;
    private float precio;
    private int anios;
    
    //atributo static siempre se inicializa en la declaracion
    private static int contadorBicicletas = 0;
    //metodos
    //getters/ setters
    public String getMarca(){
        return marca;
    } 
    public void setMarca(String m){
        marca = m;
    }
    
    public String getColor(){
        return color;
    } 
    public void setColor(String c){
        color = c;
    }
    
    public float getPrecio(){
        return precio;
    } 
    public void setPrecio(float p){
        precio = p;
    }
    
     public int getAnios(){
        return anios;
    } 
    public void setAnios(int a){
        anios = a;
    }
    //otros metodos
    public void mostrarAntiguedad(){
        if(anios>10){
            System.out.println("La bici es antigua");
        }else{
            System.out.println("La bici es nueva");
        }
    }
    
    public static int getContadorBicicleta(){
        return contadorBicicletas;
    }
    
    public static void aumentarContadorBicicleta(){
        contadorBicicletas++;
    }
    //metodo mostrar / toString()
    public void mostrarBicicleta(){
        System.out.println("Marca" + marca);
        System.out.println("Color" + color);
        System.out.println("Precio" + precio);
        System.out.println("Años" + anios);

    }
    
    @Override
    public String toString(){
        return "Marca: " + marca + ", color: " +color + ", precio" +precio + ", anios: " + anios;
    }
}
