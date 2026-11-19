public class MedioPago {
    private final String titular;

    public MedioPago(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void procesarPago(double monto) {
        if (esMontoValido(monto)) {
            System.out.println("Procesando pago por $" + monto);
        }
    }

    protected final boolean esMontoValido(double monto) {
        if (!Double.isFinite(monto) || monto <= 0) {
            System.out.println("El monto debe ser un número mayor que cero.");
            return false;
        }
        return true;
    }
}
