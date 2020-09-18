/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Clases;

/**
 * @author Maritza
 * @since 18-09-2020
 * @version 1.0 clase que describe un Camion y su comportamiento
 */
public class Camion extends Vehiculo{
    //variable global
     private double precio;
    /**
     * Constructor de la clase
     */
    public Camion(double precio,String placa, String marca, double valorPeaje) {
        super(placa, marca, valorPeaje);
        this.precio=precio;
    }

     /**
     * Constructor de la clase
     */
   
    //getters and setters
    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Camion{" + "precio=" + precio + ", placa=" + super.getPlaca() + ", marca=" + super.getMarca() + ", valorPeaje=" + super.getValorPeaje();
    }

    

    
    
}
