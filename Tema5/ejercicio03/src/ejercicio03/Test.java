/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

/**
 *
 * @author alumno
 */
public class Test {
    public void main(String[] args){
        //crear objetos de la clase Rueda
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        
        //establecer valores
        rueda1.establecerMaterial("piel");
        rueda1.establecerPulgadas(200);
        
        rueda2.establecerMaterial("goma");
        rueda2.establecerPulgadas(300);
        
        //muestra valores
        //primera rueda
        System.out.println("Primera rueda: ");
        System.out.println("material: " + rueda1.obtenerMaterial() +
                            "\ntamanio: " + rueda1.obtenerPulgadas());
        
        //segunda rueda
        System.out.println("Seguna rueda: ");
        System.out.println("material: " + rueda2.obtenerMaterial() +
                            "\ntamanio: " + rueda2.obtenerPulgadas());
        
        //creamos objectos de clase Coche
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        //establecer las marcas, los modelos y las ruedas
        coche1.establecerMarca("Mercedes");
        coche1.establecerModelo("E200");
        coche1.esrablecerRueda(rueda1);
        
        coche2.establecerMarca("Toyota");
        coche2.establecerModelo("CHR");
        coche2.esrablecerRueda(rueda1);
        
        coche3.establecerMarca("Ferrari");
        coche3.establecerModelo("488pista");
        coche3.esrablecerRueda(rueda2);
        
        
        //mostrar resultados
        
        //coche 1
        System.out.println("============================================");
        System.out.println("Coche 1: ");
        System.out.println("Marca: " + coche1.obtenerMarca() + " || "+
                           "Modelo: "+ coche1.obtenerModelo() + " || "
                           + coche1.obtenerRueda());
        
        //coche 2
        System.out.println("============================================");

        System.out.println("Coche 2: ");
        System.out.println("Marca: " + coche2.obtenerMarca() + " || "+
                           "Modelo: "+ coche2.obtenerModelo() + " || "
                           + coche2.obtenerRueda());
        //coche 3
        
        System.out.println("============================================");

        System.out.println("Coche 3: ");
        System.out.println("Marca: " + coche3.obtenerMarca() + " || "+
                           "Modelo: "+ coche3.obtenerModelo() + " || "
                            + coche3.obtenerRueda());
    }
}
