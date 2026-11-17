/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 * Practica 
 * @author alumno
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear dos bicicletas
        
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Rojo");
        bici1.setPrecio(100f);
        bici1.setAnios(5);
        
        // incrementar contador de bici en 1 
        Bicicleta.aumentarContadorBicicleta();
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Merida");
        bici2.setColor("Azul");
        bici2.setPrecio(500f);
        bici2.setAnios(15);
        
        // incrementar contador de bici en 1 
        Bicicleta.aumentarContadorBicicleta();
        //mostrar bici1 (mostrar)
        bici1.mostrarBicicleta();
        
        //mostrar bici2 (toString())
        System.out.println(bici2.toString());
        
        //String resultado = bici2.toString();
        //System.out.println(return);
        
        //mostrar color de bici1
        System.out.println("Color de bici1: " + bici1.getColor());
        
        //mostrar contador de bicicleta
        System.out.println("Contador de bicicletas: " + Bicicleta.getContadorBicicleta());
        
        //Bicicleta bici3 = new Bicicleta("Coy", "negro", 2000, 3);
        //bici3.mostrarBicicleta();
        
        //creamos ciclista
        Ciclista ciclista1 = new Ciclista("Nick", 200);
        Bicicleta bici4 = new Bicicleta("Canyon", "negro", 2000, 3, ciclista1);
        
        System.out.println(bici4.toString());
        
        Bicicleta bici5 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista());
        
        Bicicleta bici6 = new Bicicleta("Canyon", "negro", 2000, 3, new Ciclista("Ana", 2));
    }  
}
