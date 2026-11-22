/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 * Programa: que, utilizando bucles,
 * imprima la tabla de multiplicar de un número que elija el
 * usuario
 * @author RusudanKimadze
 */
public class Ejercicio14 {
    /**
     * el metodo para pedir en numbero al usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        System.out.print("Por favor, introduzca un numero: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo que se pasa el objeto como argumento y imprimia tabla de multiplicacion. 
     * @param num1 
     */
    public static void mostrarTablaDeMultiplicacion(Numero num1){
        System.out.println("--- Tabla De Multiplicacion ---");
        for(int i = 0; i<= 10; i++){
            System.out.println(num1.getValor() + " * " + i + " = " + num1.getValor()*i);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear objeto de numero con constructor por defecto
        Numero num1 = new Numero();
        
        //llamar metodo para asignar al atributo valor el numero elejido al usuario
        num1.setValor(pedirNumero());
        //llamar el metodo para mostar tabla de multiplicacion
        mostrarTablaDeMultiplicacion(num1);
    }
    
}
