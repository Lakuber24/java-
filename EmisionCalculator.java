import java.util.ArrayList;

public class EmisionCalculator {
    private ArrayList<Vehiculo> vehiculos;

    public EmisionCalculator() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrarReporte() {
        for (Vehiculo v : vehiculos) {
            v.mostrarEmisiones();
        }

        System.out.printf("\nTotal general de emisiones: %.2f kg CO₂%n", calcularTotalEmisiones());
    }

    public double calcularTotalEmisiones() {
        double total = 0;
        for (Vehiculo v : vehiculos) {
            total += v.getTotalEmisiones();
        }
        return total;
    }
}
