package poo;

import java.util.ArrayList;

class GestorGastos {

    private ArrayList<Gasto> gastos;

    public GestorGastos() {
        gastos = new ArrayList<>();
    }

    public <Gasto> void registrarGasto(Gasto gasto) {
        gastos.add(gasto);
    }
}