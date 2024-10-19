import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> productosVendidos;
    private double total;

    public Venta() {
        productosVendidos = new ArrayList<>();
        total = 0;
    }

    // Método para agregar un producto a la venta
    public void agregarProductoAVenta(Producto producto, int cantidad) {
        if (producto.getCantidadEnInventario() >= cantidad) {
            producto.reducirStock(cantidad);
            productosVendidos.add(producto);
            total += producto.getPrecio() * cantidad;
            System.out.println(cantidad + " " + producto.getNombre() + "(s) vendidos.");
        } else {
            System.out.println("Stock insuficiente para " + producto.getNombre());
        }
    }

    // Mostrar el total de la venta
    public void mostrarTotalVenta() {
        System.out.println("Total de la venta: $" + total);
    }

    public ArrayList<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   
    
}
