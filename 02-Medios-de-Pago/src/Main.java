public class Main {
    public static void main(String[] args) {
        Tarjeta tarjeta = new Tarjeta("Lucía", "0427");
        BilleteraVirtual billetera = new BilleteraVirtual("Martín", "Billetera Demo");

        tarjeta.procesarPago(4500.50);
        billetera.procesarPago(1800);

        System.out.println("\nPruebas con montos inválidos");
        tarjeta.procesarPago(0);
        billetera.procesarPago(-250);
    }
}
