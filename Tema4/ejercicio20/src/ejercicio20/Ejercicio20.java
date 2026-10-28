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
    
    //inicialisar constantes 
    final static String CIUDAD = "Madrid";
    final static String DESCUBRIDOR_DE_AMERICA = "Colon";
    final static int NOTA_DE_PREGUNTA = 5;
    
    /**
     * El metodo para pedir respuesta a usuario
     * @return 
     */
    public static String pedirRespuesta(){
        String respuesta;
        //crear nuevo instancia de objeto Scanner. 
        
        Scanner entrada = new Scanner(System.in);
      
        respuesta = entrada.nextLine();
        
        //devolver la respuesta
        return respuesta;
    }
    
    /**
     * comprobar si respuesta entrada y respuesta correcta son iguales
     * @param respuestaEntrada
     * @param respuestaCorecta
     * @return 
     */
    public static boolean esCorrecta(String respuestaEntrada,String respuestaCorecta){
        return respuestaEntrada.equalsIgnoreCase(respuestaCorecta);
    }
    
    /**
     * el metodo para mostrar primera pregunta y devolver nota de pregunta
     * @return 
     */
    public static int pregunta1(){
        String respuesta1; 
        int notaPregunta = 0; 
        
        System.out.println("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        respuesta1 = pedirRespuesta();
        if(esCorrecta(respuesta1, CIUDAD)){
            System.out.println("Muy bien, respuesta correcta.");
            notaPregunta = NOTA_DE_PREGUNTA;
        }else{
            System.out.println("No es correcto. La respuesta correcta seria: " + CIUDAD);
        }
        
        return notaPregunta;
    }   
    
    /**
     * el metodo para mostrar segunda pregunta y devolver nota de pregunta
     * @return 
     */
    public static int pregunta2(){
        String respuesta2; 
        int notaPregunta = 0;
                
        System.out.println("2ª PREGUNTA: ¿Quién descubrió América?: ");
        respuesta2 = pedirRespuesta();
        if(esCorrecta(respuesta2, DESCUBRIDOR_DE_AMERICA)){
            System.out.println("Muy bien, respuesta correcta.");
            notaPregunta = NOTA_DE_PREGUNTA;
        }else{
            System.out.println("No es correcto. La respuesta correcta seria: " + DESCUBRIDOR_DE_AMERICA);
            
        }
        
        return notaPregunta;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int notaFinal = 0;
        

        System.out.println("EXAMEN DE CULTURA GENERAL");
        
        notaFinal += pregunta1();
        notaFinal += pregunta2();

        
        System.out.println("NOTA DEL EXAMEN: " + notaFinal);

        
    }
}
