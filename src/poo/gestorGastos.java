package poo;

import java.util.ArrayList;

public class GestorGastos {

    private ArrayList<gastos> gastos;

    public GestorGastos() {
        gastos = new ArrayList<>();
    }

    public void registrarGasto(gastos gasto) {
        gastos.add(gasto);
    }
    
    public void mostrarGastos() {

    if (gastos.isEmpty()) {
        System.out.println("No hay gastos registrados");
    } else {
        for (gastos gasto : gastos) {
            System.out.println("Concepto: " + gasto.getconcepto());
            System.out.println("Monto: $" + gasto.getmonto());
            System.out.println("Categoria: " + gasto.getcategoria());
            System.out.println("-----------------------");
        }
    }
}


}