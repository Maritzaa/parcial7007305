/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.Clases;

/**
 * @author Maritza
 * @since 18-09-2020
 * @version 1.0 clase que describe un Vehiculo y su comportamiento
 */
public class Vehiculo {
    //atributos globales
    private String placa;
    private String marca;
    private double valorPeaje;
     /**
     * Constructor de la clase
     */
    public Vehiculo(String placa, String marca, double valorpeaje) {
        this.placa = placa;
        this.marca = marca;
        this.valorPeaje = valorpeaje;
    }
    //getters and setters
    /**
     * @return the placa
     * @return the marca
     * @return the valorPeaje
     */
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorPeaje() {
        return valorPeaje;
    }

    public void setValorpeaje(double valorpeaje) {
        this.valorPeaje = valorpeaje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", valorpeaje=" + valorPeaje + '}';
    }
    
}
