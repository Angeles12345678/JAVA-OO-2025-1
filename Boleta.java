public class Boleta extends Documento {
    private String dni;
    private String apellido;
    private String nombre;

    public Boleta(String direccion, String dni, String apellido, String nombre) {
        super(direccion);
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println("ID: " + getId());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("DNI: " + dni);
        System.out.println("Apellido: " + apellido);
        System.out.println("Nombre: " + nombre);
    }
}