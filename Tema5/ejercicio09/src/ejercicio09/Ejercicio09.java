/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09 {
    
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    public static int comprobarNumeros(int num1,int num2,int num3){
        int numeroMayor;
        if(num1 > num2 && num1> num3){
            numeroMayor = num1;
        }else if(num2> num1 && num2 > num3){
            numeroMayor = num2;
        }else{
            numeroMayor = num3;
        }
        return numeroMayor;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3;
        
        System.out.println("Por favor introduzca primer numero: " );
        num1 = pedirNumero();
        
        System.out.println("Ahora introduzca segundo numero: " );
        num2 = pedirNumero();
        
        System.out.println("En final introduzca tercer numero: " );
        num3 = pedirNumero();
        
        
        
        int numeroMaximo = comprobarNumeros((new Numero(num1)).getValor(), (new Numero(num2)).getValor(), (new Numero(num3)).getValor());
        
        System.out.println("Numero maximo entre estos tres es: " + numeroMaximo);
    }
    
}
