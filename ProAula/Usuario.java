public class Usuario {
    private String nombre;
    private String rol;  // "admin" o "vendedor"

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    // Métodos para verificar roles
    public boolean esAdmin() {
        return rol.equalsIgnoreCase("admin");
    }

    public boolean esVendedor() {
        return rol.equalsIgnoreCase("vendedor");
    }
}
