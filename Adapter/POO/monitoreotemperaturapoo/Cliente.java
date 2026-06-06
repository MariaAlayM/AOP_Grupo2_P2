package monitoreotemperaturapoo;

public class Cliente {

    public static void main(String[] args) {

        SensorFahrenheit sensor = new SensorFahrenheit(67); //Valor de prueba
        SensorTemperatura adaptador = new AdapterTemperatura(sensor);

        System.out.println("Temperatura en Celsius: " + adaptador.obtenerTemperaturaCelsius());
    }

}
