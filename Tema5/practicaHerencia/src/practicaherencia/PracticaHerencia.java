/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaherencia;

/**
 *
 * @author ruskakimadze
 */
public class PracticaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear personaje
        Personaje personaje1 = new Personaje();
        
        System.out.println(personaje1.toString());
        
        //crear JUGADOR
        Jugador jugador1 = new Jugador(30, "Fuerte");
        
        System.out.println(jugador1.toString());
        
        
        
    }
    
}
