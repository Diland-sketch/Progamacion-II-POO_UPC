/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPunto;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Ppal {
    
    public static void main(String[] args) {
        
        Punto p1 = new Punto(2,2);
        Punto p2 = new Punto(2,2);
        
        System.out.println("Punto = " + p1.obtenerPunto());
        System.out.println("Punto = " + p2.obtenerPunto());
        
        String resultado = p1.puntosIguales(p2);
        System.out.println(resultado);
        
    }
  
}
