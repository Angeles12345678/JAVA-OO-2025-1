public class PruebaDocumento {
    public static void main(String[] args) {
        Documento documento = new Documento("Calle Principal");
        documento.registrar(1, "Calle Falsa 123");
        
        System.out.println("ID: " + documento.getId());
        System.out.println("Dirección: " + documento.getDireccion());
    }
}
