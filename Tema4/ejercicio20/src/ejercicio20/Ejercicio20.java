/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author ruskakimadze
 */
public class Ejercicio20 {
    
    final static String CIUDAD = "Madrid";
    final static String DESCUBRIDORDEAMERICA = "Colon";
    
    
    public static String pedirRespuesta(){
        String respuesta;
        //crear nuevo instancia de objeto Scanner. 
        
        Scanner entrada = new Scanner(System.in);
      
        respuesta = entrada.nextLine();
        
        //devolver la respuesta
        return respuesta;
    }
    
    public static boolean esCorrecta(String respuestaEntrada,String respuestaCorecta){
        return respuestaEntrada.equalsIgnoreCase(respuestaCorecta);
    }
    
    public static int pregunta1(){
        String respuesta1; 
        int notaPregunta = 5; 
        
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        respuesta1 = pedirRespuesta();
        if(esCorrecta(respuesta1, CIUDAD)){
            System.out.println("Muy bien, respuesta correcta.");
            
        }else{
            System.out.println("No es correcto. La respuesta correcta seria: " + CIUDAD);
            notaPregunta = 0;
        }
       
        return notaPregunta;
    }   
    
    public static int pregunta2(){
        String respuesta2; 
        int notaPregunta = 5;
                
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?: ");
        respuesta2 = pedirRespuesta();
        if(esCorrecta(respuesta2, DESCUBRIDORDEAMERICA)){
            System.out.println("Muy bien, respuesta correcta.");
          
        }else{
            System.out.println("No es correcto. La respuesta correcta seria: " + DESCUBRIDORDEAMERICA);
            notaPregunta = 0;
        }
        return notaPregunta;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int notaPregunta = 5, notaFinal = 0;
        
        
 
        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        pregunta1();
        pregunta2();

    
        System.out.println("NOTA DEL EXAMEN: " + notaFinal);

        
    }
}
