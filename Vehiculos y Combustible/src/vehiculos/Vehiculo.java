/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author ESTACION
 */
public class Vehiculo {
    
protected Combustible combustible;
    protected double capacidadTanque;

    public Vehiculo(Combustible combustible, double capacidadTanque) {
        this.combustible = combustible;
        this.capacidadTanque = capacidadTanque;
    }

    public void info() {
        System.out.println("Vehículo con " + combustible.getTipo() +
                " | Capacidad: " + capacidadTanque +
                " | Consumo: " + combustible.getConsumoPorKm() + " por km");
    }

    public boolean puedeRecorrer(double distancia) {
        double consumoNecesario = distancia * combustible.getConsumoPorKm();
        return consumoNecesario <= capacidadTanque;
    }
}