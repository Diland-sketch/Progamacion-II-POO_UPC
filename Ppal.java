/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion1javaupc;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fraccion a = new Fraccion();
        System.out.println("a = " + a.obtenerFraccion());
        
        Fraccion b = new Fraccion(5,3);
        System.out.println("b = " + b.obtenerFraccion());
        
        Fraccion c = new Fraccion(7);
        System.out.println("c = " + c.obtenerFraccion());
        
        Fraccion suma = a.sumar(b);
        System.out.println("suma (a+b) = " + suma.obtenerFraccion());
        
        Fraccion multiplicar = b.multiplicar(c);
        System.out.println("Multiplicacion (a*b) = " + multiplicar.obtenerFraccion());
        
        Fraccion restar = b.restar(c);
        System.out.println("Resta (b-c) = " + restar.obtenerFraccion());
        
        Fraccion dividir = b.dividir(c);
        System.out.println("Dividir (b/c) = " + dividir.obtenerFraccion());
    }
    
}
