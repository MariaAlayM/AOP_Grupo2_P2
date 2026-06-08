package Singleton.AOP.impresoraaop.demo.src.main.java.com.example;

public class Usuario {

    public static void main(String[] args) {

        GestorImpresora impresora1 = new GestorImpresora();
        GestorImpresora impresora2 = new GestorImpresora();

        impresora1.imprimirDocumento("Reporte.docx");
        impresora2.imprimirDocumento("Factura001.pdf");

        System.out.println("--Comprobación de Singleton mediante AOP--");

        System.out.println("¿Son iguales?: " + (impresora1 == impresora2));

        System.out.println("Hash impresora1: " + impresora1.hashCode());
        System.out.println("Hash impresora2: " + impresora2.hashCode());
    }
}