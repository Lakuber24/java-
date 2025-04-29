public class Vehiculo {
    private String nombre;
    private int totalVehiculos;
    private int porcGasolina;
    private int porcDiesel;
    private int porcGas;

    private static final double FACTOR_GASOLINA = 2.31;
    private static final double FACTOR_DIESEL = 2.68;
    private static final double FACTOR_GAS = 2.75;

    public Vehiculo(String nombre, int totalVehiculos, int porcGasolina, int porcDiesel, int porcGas) {
        this.nombre = nombre;
        this.totalVehiculos = totalVehiculos;
        this.porcGasolina = porcGasolina;
        this.porcDiesel = porcDiesel;
        this.porcGas = porcGas;
    }

    public void mostrarEmisiones() {
        System.out.println("\nVehículo: " + nombre);

        if (porcGasolina + porcDiesel + porcGas != 100) {
            System.out.println("Advertencia: los porcentajes no suman 100%");
        }

        int numGasolina = totalVehiculos * porcGasolina / 100;
        int numDiesel = totalVehiculos * porcDiesel / 100;
        int numGas = totalVehiculos * porcGas / 100;

        double emisionGasolina = numGasolina * FACTOR_GASOLINA;
        double emisionDiesel = numDiesel * FACTOR_DIESEL;
        double emisionGas = numGas * FACTOR_GAS;

        System.out.printf("Gasolina: %d vehículos -> %.2f kg CO₂%n", numGasolina, emisionGasolina);
        System.out.printf("Diésel: %d vehículos -> %.2f kg CO₂%n", numDiesel, emisionDiesel);
        System.out.printf("Gas: %d vehículos -> %.2f kg CO₂%n", numGas, emisionGas);
    }

    public double getTotalEmisiones() {
        int numGasolina = totalVehiculos * porcGasolina / 100;
        int numDiesel = totalVehiculos * porcDiesel / 100;
        int numGas = totalVehiculos * porcGas / 100;
        return numGasolina * FACTOR_GASOLINA + numDiesel * FACTOR_DIESEL + numGas * FACTOR_GAS;
    }

    public String getNombre() {
        return nombre;
    }
}
