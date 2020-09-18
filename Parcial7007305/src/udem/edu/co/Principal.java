/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co;

import java.util.ArrayList;
import udem.edu.co.Clases.Automovil;
import udem.edu.co.Clases.Camion;
import udem.edu.co.Clases.Moto;
import udem.edu.co.Clases.Vehiculo;

public class Principal {

    public static void main(String[] args) {
      //Se crea un ArrayList para almacenar los vehiculos
        ArrayList<Vehiculo>vehiculo=new ArrayList<Vehiculo>();
        vehiculo.add(new Automovil(40000, "6754ad", "Toyota", 6));
        vehiculo.add(new Automovil(43000, "56tf", "Renault", 6));
        vehiculo.add(new Camion(12000,"56gt", "jeep", 8));
        vehiculo.add(new Camion(15000,"56gt", "Honda", 8));
        vehiculo.add(new Moto(9000, "15df", "yamaha", 4));
        vehiculo.add(new Moto(9000, "15df", "baja", 4));
        //Mostrar los vehiculos
        for (Vehiculo vehiculo1 : vehiculo) {
            System.out.println(vehiculo1);
        }  
    }
    
}
