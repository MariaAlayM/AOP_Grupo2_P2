package com.grupo2.espol;

public class Cliente {
    public static void main(String[] args) {
        SensorFahrenheit sensor = new SensorFahrenheit(80);
        SensorTemperatura adapter = new AdapterTemperatura(sensor);
        
        double temperatura = adapter.obtenerTemperaturaCelsius();
        System.out.println("temperatura entregada al cliente: " + temperatura);
    }
}
