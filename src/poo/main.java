package poo;

public class main {
    public static void main(String[] args) {

        GestorGastos gestor = new GestorGastos();

        gastos gasto1 = new gastos("Almuerzo", 25000, "Alimentacion");
        gastos gasto2 = new gastos("Taxi", 12000, "Transporte");
        gastos gasto3 = new gastos("Cine", 30000, "Entretenimiento");

        gestor.registrarGasto(gasto1);
        gestor.registrarGasto(gasto2);
        gestor.registrarGasto(gasto3);

        gestor.mostrarGastos();
    }
}