/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 * Programa: en el que se le pida al usuario que introduzca la longitud de los catetos
 * de un triángulo rectángulo y que posteriormente el programa
 * calcule la longitud de la hipotenusa
 * @author RusudanKimadze
 */
public class Test {
    /**
     * el metodo para pedir el tamanio de cateto al usuario y devolver este valor
     * @return 
     */
    public static double pedirTamanio(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextDouble();
    }
    
    /**
     * El metodo para calcular hipotenusa de un triangulo pasado como objeto
     * @param triangulo1
     * @return 
     */
    public static double calcularHipotenusa(Triangulo triangulo1){
        return Math.sqrt(Math.pow(triangulo1.getCateto1(), 2)+ Math.pow(triangulo1.getCateto2(), 2));
    }
    
    /**
     * El metodo para mostrar resultado de calculo en el metodo anterior
     * @param triangulo1 
     */
    public static void mostrarResultado(Triangulo triangulo1){
        System.out.println("La longitud de la hipotenusa de triangulo con catetos: " +triangulo1.getCateto1()
                + " y " + triangulo1.getCateto2()+ " es: " + calcularHipotenusa(triangulo1));
    }
    
    public static void main(String[] args) {
        
        //pedit valores a usuario 
        System.out.print("Para calcular la hipotenusa de triangulo entra su catetes!\n");
        System.out.print("Cateto 1: ");
        double cat1 = pedirTamanio();
        
        System.out.print("Cateto 2: ");
        double cat2 = pedirTamanio();
        
        //crear objeto con este valores
        Triangulo triangulo1 = new Triangulo(cat1, cat2);
        
        //llamar metodo para mostrar resultado
        mostrarResultado(triangulo1);
    }
}
