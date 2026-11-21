/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Test {
    /**
     * el metodo para pedir en numbero al usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo para sumar dos valores de Objetos
     * @param num1
     * @param num2
     * @return 
     */
    public static int sumarNumeros(Numero num1, Numero num2){
        return num1.getValor()+num2.getValor();
    }
    
    /**
     * El metodo para multiplicar dos valores de Objetos
     * @param num1
     * @param num2
     * @return 
     */
    public static int multiplicarNumeros(Numero num1, Numero num2){
        return num1.getValor()*num2.getValor();
    }
    
    /**
     * El metodo para comprobar los numeros y llamar y mostrar metodo adequada
     * @param num1
     * @param num2 
     */
    public static void mostrarResultado(Numero num1, Numero num2){
        if(num1.getValor()>10){
            System.out.println("Operacion realizada es MULTIPLICAR y resultado es: " + multiplicarNumeros(num1, num2));
        }else{
            System.out.println("Operacion realizada es SUMAR y resultado es: " + sumarNumeros(num1, num2));

        }
    }
    
    public static void main(String[] args) {
        //crear dos objetos por defecto
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        
        //pedir los numeros al usuario y asignar valor a objetos
        System.out.println("Por favor, introduzca primer numero: ");
        num1.setValor(pedirNumero());
        System.out.println("Ahora, introduzca segundo numero: ");
        num2.setValor(pedirNumero());
        
        //llamar el metodo para mostrar resultados:
        mostrarResultado(num1, num2);
    }
}
