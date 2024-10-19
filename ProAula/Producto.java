public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnInventario;

    public Producto(String nombre, double precio, int cantidadEnInventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // Métodos Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnInventario() {
        return cantidadEnInventario;
    }

    public void setCantidadEnInventario(int cantidadEnInventario) {
        this.cantidadEnInventario = cantidadEnInventario;
    }

    // Método para reducir stock
    public void reducirStock(int cantidad) {
        if (cantidad <= this.cantidadEnInventario) {
            this.cantidadEnInventario -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }
}