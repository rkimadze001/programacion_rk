/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author ruskakimadze
 */
public class Enunciado {
     //atributos
    private String pregunta;
    private String respuesta;
    
    private static int cantidadDePregunta = 0;
    //constructores
    public Enunciado(){
        this.pregunta = "";
        this.respuesta = "";
        contarPreguntas();
    }
    
    public Enunciado(String pregunta, String respuesta){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        contarPreguntas();

    }
    
    
    //metodos
    //setter // getters
    public void setPregunta(String pregunta){
        this.pregunta = pregunta;
    }
    
    public String getPregunta(){
        return this.pregunta;
    }
    
    public void setRespuesta(String respuesta){
        this.respuesta = respuesta;
    }
    
    public String getRespuesta(){
        return this.respuesta;
    }
    
    //metodos estaticos
    public static void contarPreguntas(){
        cantidadDePregunta++;
    }
    
    public static int mostrarCantidadDePreguntas(){
        return cantidadDePregunta;
    }
    
    //toString
    @Override
    public String toString(){
        return "Pregunta: " + this.pregunta
                +"\nRespuesta: " + this.respuesta;
    }
   
}
