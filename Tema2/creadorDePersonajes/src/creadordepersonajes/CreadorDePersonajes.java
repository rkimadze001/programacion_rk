/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creadordepersonajes;
import java.util.Scanner;
/**
 * Programa: Lee los datos de un personaje por consola y 
 * calcula sus atributos finales (vida máxima, XP y daño) de forma automática.
 * 
 * @author RusudanKimadze
 */
public class CreadorDePersonajes {
    
    final static int VIDA_POR_NIVEL = 20;
    final static int XP_POR_NIVEL = 200;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letraInicialDeNombre;
        int edadPersonaje, nivelPersonaje, vidaInicial, experiencia, 
                vidaMaxima, xpSiguienteNivel, vidaRestante;
        int danio = 35;
        double alturaPersonaje;
        
        Scanner teclado = new Scanner(System.in);
        
        // FASE 1: LECTURA DE DATOS
        System.out.println("---------------------------------");
        System.out.println("      CREACIÓN DE PERSONAJE   ");
        System.out.println("---------------------------------");
        System.out.print("Inicial: ");
        letraInicialDeNombre = teclado.next().charAt(0);
        
        System.out.print("Edad: ");
        edadPersonaje = teclado.nextInt();
        
        System.out.print("Altura: ");
        alturaPersonaje = teclado.nextDouble();
        
        System.out.print("Nivel: ");
        nivelPersonaje = teclado.nextInt();
        
        System.out.print("Vida inicial: ");
        vidaInicial = teclado.nextInt();
        
        System.out.print("Experiencia: ");
        experiencia = teclado.nextInt();
        
        // FASE 2: CÁLCULO DE ATRIBUTOS
        vidaMaxima = nivelPersonaje * VIDA_POR_NIVEL;
        xpSiguienteNivel = nivelPersonaje * XP_POR_NIVEL;
        vidaRestante = vidaInicial - danio;
        
        // Resultados
  
        System.out.println("---------------------------------");
        System.out.println("           PERSONAJE             ");
        System.out.println("---------------------------------");
        System.out.println("Nombre: " + letraInicialDeNombre +" | Edad: " + edadPersonaje + " años ") ;
        System.out.println("Vida inicial: " + vidaInicial +" | Vida máx: " + vidaMaxima ) ;
        System.out.println("Experiencia: " + experiencia +" | XP sig. nivel: " + xpSiguienteNivel ) ;
        
        System.out.println("[!] Tras recibir "+danio +" de daño: ");
        System.out.println("Vida restante: " + vidaRestante + " pts");

    }
    
}
