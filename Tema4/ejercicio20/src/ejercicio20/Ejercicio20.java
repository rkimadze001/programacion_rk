/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 * Programa: le haga un examen al usuario, preguntándole 
 * cuál es la capital de España y quién descubrióAmérica.
 * @author RusudanKimadze
 */
public class Ejercicio20 {
    
    //inicialisar constantes 
    final static String CIUDAD = "Madrid";
    final static String DESCUBRIDOR_DE_AMERICA = "Colon";
    final static int NOTA_DE_PREGUNTA = 5;
    
    /**
     * El metodo para pedir respuesta a usuario y devolva este respuesta
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
     * comprobar si respuesta entrada y respuesta correcta son iguales y devolva true o false
     * @param respuestaEntrada
     * @param respuestaCorecta
     * @return 
     */
    public static boolean esCorrecta(String respuestaEntrada,String respuestaCorecta){
        return respuestaEntrada.equalsIgnoreCase(respuestaCorecta);
    }
    
    /**
     * el metodo para mostrar primera pregunta y devolva nota de pregunta
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
     * el metodo para mostrar segunda pregunta y devolva nota de pregunta
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
       //declarar y inicializar variable
        int notaFinal = 0;
        
        //mostrar inicial mensage
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("--------------------------------------------------");
       
        //llamar los metodos pregunta1 y pregunta2 y aniadir los valores que ellos devolven a notaFinal
        notaFinal += pregunta1();
        notaFinal += pregunta2();

       
        System.out.println("--------------------------------------------------");
        System.out.println("NOTA DEL EXAMEN: " + notaFinal);

        
    }
}
