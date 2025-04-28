public class PruebaBoleta {
    public static void main(String[] args) {
        Boleta boleta = new Boleta("Av. Principal", "12345678", "Gonzalez", "Juan");
        boleta.registrar(2001,"Av. Sol 456");
        boleta.mostrarDatos();
}
}
