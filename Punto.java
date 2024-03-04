/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPunto;

/**
 *
 * @author OSMAR LOPEZ
 */
public class Punto {
    
    private double x;
    private double y;
    
    public Punto(){
        this(0,0);
    }
    
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double getPuntoX(){
        return x;
    }
    
    public double getPuntoY(){
        return y;
    }
    
    public void setPuntoX(double x){
        this.x = x;
    }
    
    public void setPuntoY(double y){
        this.y = y;
    }
    
    public String obtenerPunto(){
        return "(" + this.getPuntoX() + ", " + this.getPuntoY() + ")" ;
    }
    
    public String puntosIguales(Punto p){
        if(this.x == p.getPuntoX() && this.y == p.y){
            return "Los Puntos son iguales";
        }else{
            return "Los Puntos son diferentes";
        }
    }
    
    
}
