package monitoreotemperaturapoo;

public class AdapterTemperatura implements SensorTemperatura{

    private SensorFahrenheit sensorF;

    public AdapterTemperatura(SensorFahrenheit sensorF) {
        this.sensorF = sensorF;
    }
    
    @Override
    public double obtenerTemperaturaCelsius() {
        double fahrenheit = sensorF.obtenerTemperaturaFahrenheit();
        return (fahrenheit - 32) / 1.8;
    }

}
