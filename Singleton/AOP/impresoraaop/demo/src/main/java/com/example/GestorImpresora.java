package Singleton.AOP.impresoraaop.Usuario;

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