public class Main {
    public static void main(String[] args) {
        LibroDigital libro = new LibroDigital("El Principito");
        Audiolibro audiolibro = new Audiolibro("La isla del tesoro");

        libro.mostrarDescripcion();
        audiolibro.mostrarDescripcion();
    }
}
