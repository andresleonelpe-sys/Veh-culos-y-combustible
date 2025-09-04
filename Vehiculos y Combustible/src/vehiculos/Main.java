/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import Combustible.Electrico;

/**
 *
 * @author ESTACION
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo carroGasolina = new Carro(new Gasolina(), 40);
        Vehiculo camionDiesel = new Camion(new Diesel(), 60);
        Vehiculo carroElectrico = new Carro(new Electrico(), 30);

        double distancia = 150;

        carroGasolina.info();
        System.out.println("¿Puede recorrer " + distancia + " km? " + carroGasolina.puedeRecorrer(distancia));

        camionDiesel.info();
        System.out.println("¿Puede recorrer " + distancia + " km? " + camionDiesel.puedeRecorrer(distancia));

        carroElectrico.info();
        System.out.println("¿Puede recorrer " + distancia + " km? " + carroElectrico.puedeRecorrer(distancia));
    }
}