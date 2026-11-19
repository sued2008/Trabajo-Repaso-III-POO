public class BilleteraVirtual extends MedioPago {
    private final String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (esMontoValido(monto)) {
            System.out.println("Pago con billetera virtual (" + nombreAplicacion + ")"
                    + " | Titular: " + getTitular() + " | Monto: $" + monto);
        }
    }
}
