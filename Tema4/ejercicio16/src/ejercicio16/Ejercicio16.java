/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

/**
 * Programa: Crea un programa en JAVA que calcule las siguientes operaciones y muestre su resultado: 
 * • Raízcuadradade64. • 8elevadoalcubo. • Exponencialde2. • Logaritmode2,71828. 
 * • Menorvalorentre2y3. • Valorabsolutode-4,5. • Redondeando-4,5conROUND. • Senode45grados.
 * @author RusudanKimadze
 */
public class Ejercicio16 {
    
    /**
     * El metodo devolve raic cuadrada de 68
     * @return 
     */
    public static double raizCuadrada(){
        return Math.sqrt(64);
    }
    
    /**
     * El metodo devolve el cubo de 8
     * @return 
     */
    public static double elCubo(){
        return Math.pow(8, 3);
    }
    
    /**
     * El metodo devolve el exponencial de 2
     * @return 
     */
    public static int exponencial(){
        
        return Math.getExponent(2);
    }
    
    /**
     * El metodo devolve logaritmo de 2.71828
     * @return 
     */
    public static double logaritmo(){
        return Math.log(2.71828);
    }
    
    /**
     * El metodo devolve el menor entre 2 y 3
     * @return 
     */
    public static int esMenor(){
        return Math.min(2, 3);
    }
    
    /**
     * El metodo devolve el absoluto de -4.5
     * @return 
     */
    public static double absoluto(){
        return Math.abs(-4.5);
    }
    
    /**
     * El metodo devolve redondeado de -4.5
     * @return 
     */
    
    public static int redondeando(){
        return Math.round(-4.5f);
    }
    
    /**
     * El metodo devolve deno de 45 grados 
     * @return 
     */
    public static double seno(){
        return Math.sin(45);
    }
    
    /**
     * El metodo muestra el resultado de cada calculation en la pantalla
     */
    public static void mostrarResultado(){
        
        System.out.println("Raíz Cuadrada De 64 es: " + raizCuadrada());
        System.out.println("8 elevado al cubo es:  " + elCubo());
        System.out.println("Exponencial 2 es:  " + exponencial());
        System.out.println("Logaritmo De 2,71828 es:  " + logaritmo());
        System.out.println("Menor Valor Entre 2 y 3:  " + esMenor());
        System.out.println("Valor Absoluto De -4,5 es:  " + absoluto());
        System.out.println("Redondeando -4,5 con ROUND es:  " + redondeando());
        System.out.println("Seno De 45 Grados es:  " + seno());

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //llamar la metodo para mostrar resultado en pantalla
        mostrarResultado();
        
        
    }
    
}
