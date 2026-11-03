/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio27 {

    public static String pedirParte() {
        String parteDeMoneda;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor introduzca la parte de moneda(cara o cruz):");
        parteDeMoneda = entrada.nextLine();

        return parteDeMoneda;
    }

    public static int resultadoAleatorio() {
        int numeroAleatorio;

        numeroAleatorio = (int) Math.round(Math.random());

        return numeroAleatorio;
    }

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
        String entrada;
        int numeroAleatorio = resultadoAleatorio();

        do {
            entrada = pedirParte();
            mostrarResultado(comprobar(numeroAleatorio, entrada));
        } while (!comprobar(numeroAleatorio, entrada));
    }

}
