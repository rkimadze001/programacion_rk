/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coladecorreos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa: cola de correos
 * @author RusudanKimadze
 */
public class Coladecorreos {
    
    public static final String ENVIAR = "E-";
    public static final String RECOGER = "R-";
    
    /**
     * El metodo para perir tipo de ticket a usuario
     * @return 
     */
    public static String pedirTipoDeTicket(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
        
    }
    
    /**
     * El metodo para pedir numero y devolver este valor
     * @return 
     */
    public static int pedirNumero (){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
    
    /**
     *El metodo para generar numero aleatorio entero y devolver esto valor.
     * @return 
     */
    public static int numeroAleatorio(){
          return (int)Math.floor(Math.random() * 100 + 1);  
    }
    
    /**
     *El metodo para imprimir el menu
     */
    public static void mostrarMenu(){
        System.out.println("Bienbenida a TuCorreos, elige el operacion: ");
        System.out.println("-----------------------------------------");

        System.out.println("1. Enviar");
        System.out.println("2. Recoger");
        System.out.println("3. Generar late de ticket");
        System.out.println("4. Salir");
        System.out.println("-----------------------------------------");
      
    }
    
    /**
     * el metodo genera el nombre del ticket depende a entrada de usuaurio
     * @param numero
     * @param tipoOperacion 
     */
    public static void generarNombreDeTicket (int numero, String tipoOperacion){
        System.out.println("Ticket generada es: ");
        if(tipoOperacion.equalsIgnoreCase("Enviar")){
            System.out.println(ENVIAR + numero);
        }else if(tipoOperacion.equalsIgnoreCase("Recoger")){
            System.out.println(RECOGER + numero);
        }else{  
            System.out.println("No podemos hacer este operacion!");
        }
      
    }
   
    
   /**
    * El metodo pide usuario tipo de ticket y candidad y luego llama generarTicket() metodo.
    */
    public static void generarLote(){
        System.out.println("Por favor elige cual queres: Enviar o Recoger el ticket:");
        String tipo = pedirTipoDeTicket();
        System.out.println("Ahora introduzca la candidad de tickets: ");
        int candidad = pedirNumero ();
        
        while(candidad %  3 != 0){
            System.out.println("Upss Error!!! Por favor entra un numero que es multiplo de 3.");
            candidad = pedirNumero();
        }
        
        generarTicket(tipo, candidad);
        
    }
    
    /**
     * Este metodo genera tickets depende de tipo y candidad entrado a usuario
     * @param tipo
     * @param candidad 
     */
    public static void generarTicket(String tipo, int candidad){
        
        for(int i = 0; i < candidad; i++){
           generarNombreDeTicket(numeroAleatorio(), tipo);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroEntradaMenu = 0;
        
       do{ 
           
           mostrarMenu();
       
            try{

               numeroEntradaMenu = pedirNumero();

            }catch(InputMismatchException e){ 
                System.out.println("Ups Error! Tienes que elegir el numero!!!"); 
            }
            
            switch(numeroEntradaMenu){
                    case 1:   
                       generarNombreDeTicket(numeroAleatorio(), "enviar");
                       break;
                    case 2:
                       generarNombreDeTicket(numeroAleatorio(), "recoger");
                       break;
                    case 3:
                        generarLote();
                        break;
                    case 4: 
                        System.out.println("Tu elige salir de programa. Hasta luego!!!");
                        break;
                    default: 
                        System.out.println("Elige un numero mostrado en menu opciones (1-4).");
          
            }
        }while(numeroEntradaMenu != 4);
       
    }
}
