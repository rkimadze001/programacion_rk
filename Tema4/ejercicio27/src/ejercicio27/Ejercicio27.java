/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 * Programa: simule el lanzamiento de una moneda. Le pediremos al usuario que
 * pida “cara” o “cruz” y generaremos aleatoriamente un resultado. Luego le
 * mostraremos al usuario el resultado y le daremos la Enhorabuena si ha
 * acertado o le diremos que ha perdido y otra vez le pediremos que elija “cara”
 * o “cruz” y tiraremos la moneda de nuevo, así hasta que acierte.
 * @author RusudanKimadze
 */
public class Ejercicio27 {

    /**
     * El metodo para pedir el parte de la moneta a usuario como String y devolva este 
     * String
     * @return  
     */
    public static String pedirParte() {
        String parteDeMoneda;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor introduzca la parte de moneda(cara o cruz):");
        parteDeMoneda = entrada.nextLine();

        return parteDeMoneda;
    }
    
    /**
     * El metodo genera el numero aleatorio 0 o 1 y delovlva este numero
     * @return 
     */
    public static int resultadoAleatorio() {
        int numeroAleatorio;

        numeroAleatorio = (int) Math.round(Math.random());

        return numeroAleatorio;
    }

    /**
     * El metodo utiliza bucle swich y condicional para comprobar el numero aleatorio 
     * y el parte de moneta que el usuario he entrado y devolva true o false si estos 
     * son eguales o no.
     * @param numero
     * @param entrada
     * @return 
     */
    public static boolean comprobar(int numero, String entrada) {
        boolean esIgual = false;
        String respondaCorecta = "";
        
        switch(numero){
            case 0: 
                respondaCorecta =  "cara";
                break;
            case 1:
                respondaCorecta = "cruz";
                break;
        
        }
        
        if (entrada.equalsIgnoreCase(respondaCorecta)){
            esIgual = true;
        }
        
        return esIgual;
    }

    /**
     * El metodo para imprimir resultado depende a que el metodo comprobar devolva
     * @param esIgual 
     */
    public static void mostrarResultado(boolean esIgual) {
        if (esIgual) {
            System.out.println("Enorabuena!");
        } else {
            System.out.println("No es correcta, intenta otra vez!");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializar variables
        String entrada;
        int numeroAleatorio;

        //bucle para llamar todos metodos y imprimir resultado 
        do {
            numeroAleatorio = resultadoAleatorio();
            entrada = pedirParte();
            mostrarResultado(comprobar(numeroAleatorio, entrada));
        } while (!comprobar(numeroAleatorio, entrada));
    }

}
