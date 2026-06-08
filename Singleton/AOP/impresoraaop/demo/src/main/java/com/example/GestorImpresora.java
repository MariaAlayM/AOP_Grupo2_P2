package Singleton.AOP.impresoraaop.demo.src.main.java.com.example;


public class GestorImpresora {

    private String nombreImpresora = "Impresora_Oficina01";

    public GestorImpresora() {
    }

    public void imprimirDocumento(String documento) {
        System.out.println(nombreImpresora +
                ": Imprimiendo " + documento + "...");
        System.out.println("Documento impreso correctamente\n");
    }
}