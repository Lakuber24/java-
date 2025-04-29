public class EmisionVehiculos {
    public static void main(String[] args) {
        EmisionCalculator calculadora = new EmisionCalculator();

        calculadora.agregarVehiculo(new Vehiculo("Camiones Livianos", 400000, 30, 40, 30));
        calculadora.agregarVehiculo(new Vehiculo("Camiones Medianos", 280000, 25, 40, 35));
        calculadora.agregarVehiculo(new Vehiculo("Camiones Pesados", 380000, 10, 40, 50));
        calculadora.agregarVehiculo(new Vehiculo("Tractocamiones", 1150000, 5, 90, 5));
        calculadora.agregarVehiculo(new Vehiculo("Volquetas", 936000, 10, 40, 50));

        calculadora.mostrarReporte();
    }
}
