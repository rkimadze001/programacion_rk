/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

/**
 *
 * @author RusudanKimadze
 */
public class Test {
    public static void main(String[] args){
        Coche miCoche = new Coche();
        Coche cochePadre = new Coche();
        
        //miCoche
        miCoche.establecerMarca("Ferrari");
        miCoche.establecerColor("verde");
        miCoche.establecerModelo("488pista");
        
        //cochePader
        cochePadre.establecerMarca("Mercedes");
        cochePadre.establecerColor("gris");
        cochePadre.establecerModelo("E200");
        
        //arrancar ambos coches
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        
        // Acelera 5 veces miCoche.
        for(int i = 0; i <5; i++){
            miCoche.acelerarCoche();
        }

        //Frena 2 veces miCoche
        for(int i = 0; i <2; i++){
            miCoche.frenarCoche();
        }

        //Acelera 3 veces cochePadre
        for(int i = 0; i < 3; i++){
            cochePadre.acelerarCoche();
        }

        //Apaga cochePadre
        cochePadre.apagarCoche();

        //Muestra el estado de miCoche y luego el estado de cochePadre.
        miCoche.obtenerEstado();
        cochePadre.obtenerEstado();

    }
}
