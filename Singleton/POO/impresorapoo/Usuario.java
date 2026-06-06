package Singleton.POO.impresorapoo;

public class Usuario {
    public static void main(String[] args) {

        GestorImpresora impresora1 = GestorImpresora.getInstancia();
        GestorImpresora impresora2 = GestorImpresora.getInstancia();

        impresora1.imprimirDocumento("Reporte.docx");
        impresora2.imprimirDocumento("Factura001.pdf");


        // Verificación de que ambas referencias apuntan a la misma instancia
        System.out.println("--Comprobación de que apuntan a la misma instancia--\n" + "¿Son iguales?: " + (impresora1 == impresora2));
        System.out.println("Hash impresora1: " + impresora1.hashCode());
        System.out.println("Hash impresora2: " + impresora2.hashCode());
    }

}