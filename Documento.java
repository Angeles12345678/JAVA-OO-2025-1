public class Documento {
    private int id;
    private String direccion;

    public Documento(String direccion) {
        this.id = 0;
        this.direccion = direccion + " - ";
    }

    public void registrar(int id, String direccion) {
        this.id = id;
        this.direccion += direccion;
    }

    public int getId(){
        return this.id;
    }

    public String getDireccion(){
        return this.direccion;
    }
}
