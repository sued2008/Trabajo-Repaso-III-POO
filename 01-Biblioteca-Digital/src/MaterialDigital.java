public class MaterialDigital {
    private final String titulo;

    public MaterialDigital(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarDescripcion() {
        System.out.println("Material disponible en la biblioteca digital");
    }
}
