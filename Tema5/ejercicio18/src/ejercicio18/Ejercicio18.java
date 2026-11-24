/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 * Programa: que pida al usuario dos números
 * por teclado (serán el atributo de dos objetos distintos) Posteriormente el programa
 * mostrará un menú que le permitirá al usuario
 * Sumar los números
 * Restar los números
 * Multiplicar los números
 * Dividir los números
 * Salir del programa
 * @author RusudanKimadze
 */
public class Ejercicio18 {
    /**
     * El metodo para pedir un numero a usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo para mostrar menu
     */
    public static void mostrarMenu(){
        System.out.println("Por favor elegir numero de tu operacion: ");
        System.out.println("1.- Sumar los números.");
        System.out.println("2.- Restar los números.");
        System.out.println("3.- Multiplicar los números.");
        System.out.println("4.- Dividir los números.");
        System.out.println("5.- Salir del programa.");
        
    }
    
    /**
     * el metodo para calcular y mostrar resultado de operaciones que eliga usuario
     * @param numero1
     * @param numero2 
     */
    public static void mostrarResultado(Numero numero1, Numero numero2){
        int numeroElegido = 0;
        
        do{
            mostrarMenu();
            numeroElegido = pedirNumero();
            int num1 = numero1.getValor();
            int num2 = numero2.getValor();
            int resultado;
            
            switch (numeroElegido){
                case 1: 
                    resultado = num1 + num2;
                    System.out.println("Resultado de sumar es: " + resultado);
                    break;
                case 2: 
                    resultado = num1 - num2;
                    System.out.println("Resultado de restar es: " + resultado);
                    break;
                case 3: 
                    resultado = num1 * num2;
                    System.out.println("Resultado de multiplicar es: " + resultado);
                    break;
                case 4: 
                    try{
                        resultado = num1 / num2;  
                    System.out.println("Resultado de dividir es: " + resultado);

                    }catch(ArithmeticException e){
                        System.out.println("No podemos dividir a 0.");             
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de programa...");
                    break;
                default: 
                    System.out.println("Opción no válida. Entra numeros entre 1 y 5.");
             }
        }while(numeroElegido != 5);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        System.out.println("Por favor, introduzca primer numero: ");
        Numero num1 = new Numero(pedirNumero());
        
        System.out.println("Ahora, introduzca segundo numero: ");
        Numero num2 = new Numero(pedirNumero());
        
        mostrarResultado(num1,num2);
    }
    
}
