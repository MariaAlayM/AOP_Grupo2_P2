package Singleton.POO.impresorapoo;

public class GestorImpresora {

    private static GestorImpresora instancia;

    private final String nombreImpresora = "Impresora_Oficina01";


    private GestorImpresora(){}

    public static GestorImpresora getInstancia() {
        if(instancia == null){
            instancia = new GestorImpresora();
        }
        return instancia;
    }
    
    public void imprimirDocumento(String documento){
        System.out.println(nombreImpresora + ": Imprimiendo " + documento + "...");
        System.out.println("Documento impreso correctamente\n");
    }

}
