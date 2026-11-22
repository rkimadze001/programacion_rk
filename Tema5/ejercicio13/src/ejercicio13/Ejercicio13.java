/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 * Programa: utilizando bucles, escriba "Hola, que tal"
 * cinco veces Para ello tendrás una clase “ con un
 * atributo “ de tipo String.
 * @author RusudanKimadze
 */
public class Ejercicio13 {
    /**
     * El metodo para imprimir mensaje cinco veces
     * @param saludo1 
     */
    public static void mostrarMensaje(Saludo saludo1){
        for(int i = 0; i < 5; i++){
            System.out.println(saludo1.getFrase());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declarar y inicializar variable mensaje
        String mensage = "Hola, que tal";
        
        //crean nuevo objeto de clase Saludo con mensage
        Saludo saludo1 = new Saludo(mensage);
        
        //llamar metodo mostrarMensage y pasamos objeto saludo1 como argumento
        mostrarMensaje(saludo1);
        
    }
    
}
