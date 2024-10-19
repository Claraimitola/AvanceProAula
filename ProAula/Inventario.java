import java.util.ArrayList;

public class Inventario {
  private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar un producto
    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    // Buscar un producto por nombre
    public Producto buscarProducto(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null; // Producto no encontrado
    }

    // Mostrar todos los productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() + ", Precio: $" + producto.getPrecio() + ", Stock: " + producto.getCantidadEnInventario());
        }
    }  
}
