/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice = 0;
        
        //while
        System.out.println("while");
        while(indice < 10){
            System.out.println(indice);
            indice ++;
        }
        
        // do while
        indice = 0;
        System.out.println("do while");
        do{
            System.out.println(indice);
            indice ++;
        }while(indice<10);

        //for
        System.out.println("for");
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
               System.out.println(i);
            }
        }
        
        //menus
        int opc = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            //mostramos el menu al usuario
            System.out.println("-- Menu --");
            System.out.println("1. Ber catalogo");
            System.out.println("2. Solicitar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Salir");

            //pedir opcion
            System.out.print("Elija una opcion: ");
            opc = entrada.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("Has elejido ver el catalog.");
                    break;
                case 2:
                    System.out.println("Has elejido ver solicitar un libro.");
                    break;
                case 3:
                    System.out.println("Has elejido ver Devolver un libro.");
                    break;
                case 4:
                    System.out.println("Gracias para usar nuestro programa.");
                    break;
            }
            
        }while(opc != 4);
    }
    
}
