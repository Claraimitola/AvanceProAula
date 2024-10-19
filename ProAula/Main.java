import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear inventario
        Inventario inventario = new Inventario();

        // Agregar productos al inventario
        Producto producto1 = new Producto("Laptop", 1000.0, 10);
        Producto producto2 = new Producto("Smartphone", 600.0, 15);
        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Juan Pérez", "001");
        Cliente cliente2 = new Cliente("María Gómez", "002");

        // Crear usuarios
        Usuario admin = new Usuario("Admin1", "admin");
        Usuario vendedor = new Usuario("Vendedor1", "vendedor");

        // Crear una venta
        Venta venta = new Venta();
        venta.agregarProductoAVenta(producto1, 2); // Vendiendo 2 laptops
        venta.agregarProductoAVenta(producto2, 1); // Vendiendo 1 smartphone

        // Mostrar el total de la venta
        venta.mostrarTotalVenta();

        // Generar factura para la venta
        ArrayList<Producto> productosVendidos = new ArrayList<>();
        productosVendidos.add(producto1);
        productosVendidos.add(producto2);
        Factura factura = new Factura("F001", cliente1, productosVendidos, venta.getTotal());
        factura.mostrarFactura();

        // Reporte de ventas
        ReporteVenta reporte = new ReporteVenta();
        reporte.agregarFactura(factura);

        // Mostrar reporte de ventas
        System.out.println("\nReporte de ventas:");
        reporte.mostrarReporte();

        // Verificación de roles
        if (admin.esAdmin()) {
            System.out.println(admin.getNombre() + " puede acceder a las funciones de administrador.");
        }
        if (vendedor.esVendedor()) {
            System.out.println(vendedor.getNombre() + " puede acceder a las funciones de vendedor.");
        }

        // Mostrar inventario actualizado
        System.out.println("\nInventario después de la venta:");
        inventario.mostrarProductos();
    }
}
