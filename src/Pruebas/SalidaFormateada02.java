package Pruebas;

public class SalidaFormateada02 {
    public static void main(String[] args) {
        System.out.printf("%-20s %-20s %-20s\n", "Artículo","Precio/caja","Nºcajas");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-20s %.2f %18d\n", "Manzanas",4.5,10);
    }
}