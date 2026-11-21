/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 * Programa: lea tres números e imprima por pantalla el mayor de ellos.
 * @author Rusudan Kimadze
 */
public class Ejercicio09 {
    /**
     * El metodo para pedir un numero al usuario y devolver este valor
     * @return 
     */
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     * El metodo para pasar tres objetos como parametros y comprobar y devolver mayor valores de estos objetos.
     * @param num1
     * @param num2
     * @param num3
     * @return 
     */
    public static int comprobarNumeros(Numero num1,Numero num2,Numero num3){
        int numeroMayor;
        if(num1.getValor() >= num2.getValor() && num1.getValor()>= num3.getValor()){
            numeroMayor = num1.getValor();
        }else if(num2.getValor()>= num1.getValor() && num2.getValor() >= num3.getValor()){
            numeroMayor = num2.getValor();
        }else{
            numeroMayor = num3.getValor();
        }
        return numeroMayor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprimir mensaje para pedir numero entero y crear objetos de tres Numeros
        System.out.println("Por favor introduzca primer numero: " );
        Numero num1 = new Numero(pedirNumero());
        
        System.out.println("Ahora introduzca segundo numero: " );
        Numero num2 = new Numero(pedirNumero());
        
        System.out.println("En final introduzca tercer numero: " );
        Numero num3 = new Numero(pedirNumero());
        
        //llamar el metodo para comprobar valores de nuevos objectos 
        int numeroMaximo = comprobarNumeros(num1,num2,num3);
        
        System.out.println("El numero maximo de los tres es: " + numeroMaximo);
    }
    
}
