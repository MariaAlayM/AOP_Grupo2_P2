package com.grupo2.espol;


public class Cliente {
    public static void main(String[] args) {
        // Prueba temperatura baja
        SensorFahrenheit sensor = new SensorFahrenheit(80);
        SensorTemperatura adapter = new AdapterTemperatura(sensor);
        
        double temperatura = adapter.obtenerTemperaturaCelsius();
        System.out.println("temperatura entregada al cliente: " + temperatura +"\n");

        // Prueba temperatura Alta
        SensorFahrenheit sensor2 = new SensorFahrenheit(140);
        SensorTemperatura adapter2 = new AdapterTemperatura(sensor2);
        double temperatura2 = adapter2.obtenerTemperaturaCelsius();
        System.out.println("temperatura entregada al cliente: " + temperatura2);
    }
}
