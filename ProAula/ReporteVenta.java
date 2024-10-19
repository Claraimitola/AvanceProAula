import java.util.ArrayList;

public class ReporteVenta {
      private ArrayList<Factura> facturas;

    public void ReporteVentas() {
        facturas = new ArrayList<>();
    }

    // Agregar una factura al reporte
    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    // Mostrar reporte de ventas
    public void mostrarReporte() {
        System.out.println("Reporte de Ventas:");
        double totalIngresos = 0;
        for (Factura factura : facturas) {
            factura.mostrarFactura();
            totalIngresos += factura.total;
        }
        System.out.println("Total de ingresos: $" + totalIngresos);
    }
}
