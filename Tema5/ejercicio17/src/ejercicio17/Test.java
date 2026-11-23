/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 * programa: le haga un examen al usuario, haciéndole 4 preguntas (por ejemplo
 * ¿cuál es la capital de España?, ¿quién descubrió América? Le dirá
 * si ha respondido correctamente o no, cual sería la respuesta
 * correcta, y por último le dirá su nota (Cada pregunta acertada vale 2 5
 * @author RusudanKimadze
 */
public class Test {
    
    //inicialisar constante
    final static float NOTA_DE_PREGUNTA = 2.5f;
    
    /**
     * El metodo para pedir la respuesta al usuario y devolver este valor
     * @return 
     */
    public static String pedirRespuesta(){
       Scanner entrada = new Scanner(System.in);
       return entrada.nextLine();
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
     * el metodo para mostrar pregunta y devolva nota de pregunta
     * @param preguntar
     * @return 
     */
    public static float preguntar(Enunciado enunciado1, String respuestaCorrecta){
        float notaPregunta = 0; 
        
        System.out.println(enunciado1.getPregunta());

        enunciado1.setRespuesta(pedirRespuesta());
        
        if(esCorrecta(enunciado1.getRespuesta(), respuestaCorrecta)){
            System.out.println("Muy bien, respuesta correcta.");
            notaPregunta = NOTA_DE_PREGUNTA;
        }else{
            System.out.println("No es correcto. La respuesta correcta seria: " + respuestaCorrecta);
        }
        
        return notaPregunta;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float notaFinal = 0;
        //crear objetos de clase Enunciado
        //primero pregunta
        Enunciado enunciado1 = new Enunciado("1ª PREGUNTA: ¿Cuál es la capital de España?: ");
        notaFinal += preguntar(enunciado1, "madrid");
       
        //segunda pregunta
        Enunciado enunciado2 = new Enunciado("2ª PREGUNTA: ¿Quién descubrió América?: ");
        notaFinal += preguntar(enunciado2, "colon");
        
        //tercero pregunta
        Enunciado enunciado3 = new Enunciado("2ª PREGUNTA: ¿Cuál es la capital de Georgia?: ");
        notaFinal += preguntar(enunciado3, "Tbilisi");
       
        //mostrar nota final
        System.out.println("He finalizado el examen. Tu nota final es: "+ notaFinal);

    }
    
}
