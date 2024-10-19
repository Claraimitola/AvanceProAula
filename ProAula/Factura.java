import java.util.ArrayList;
import java.util.Date;

public class Factura {
        private String idFactura;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<Producto> productosVendidos;
    double total;

    public Factura(String idFactura, Cliente cliente, ArrayList<Producto> productosVendidos, double total) {
        this.idFactura = idFactura;
        this.fecha = new Date();  // Fecha actual
        this.cliente = cliente;
        this.productosVendidos = productosVendidos;
        this.total = total;
    }

    public void mostrarFactura() {
        System.out.println("Factura Nro: " + idFactura);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos vendidos:");
        for (Producto producto : productosVendidos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.getPrecio());
        }
        System.out.println("Total: $" + total);
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
