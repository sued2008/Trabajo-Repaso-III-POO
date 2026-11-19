public class Tarjeta extends MedioPago {
    private final String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (esMontoValido(monto)) {
            System.out.println("Pago con tarjeta terminada en " + ultimosCuatroDigitos
                    + " | Titular: " + getTitular() + " | Monto: $" + monto);
        }
    }
}
