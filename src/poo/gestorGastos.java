package poo;

import java.util.ArrayList;

/**
 * Administra la colección de gastos y las operaciones disponibles sobre ella.
 */
public class GestorGastos {

    private ArrayList<gastos> gastos;

    /**
     * Crea un gestor con una lista de gastos vacía.
     */
    public GestorGastos() {
        gastos = new ArrayList<>();
    }

    /**
     * Agrega un gasto a la colección.
     *
     * @param gasto gasto que se desea registrar
     */
    public void registrarGasto(gastos gasto) {
        gastos.add(gasto);
    }

    /**
     * Muestra todos los gastos registrados en la consola.
     */
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

/**
 * Calcula la suma de los montos de todos los gastos registrados.
 *
 * @return total acumulado; devuelve 0 si no hay gastos
 */
public double calcularTotal() {
    double total = 0;

    for (gastos gasto : gastos) {
        total = total + gasto.getmonto();
    }

    return total;
}

/**
 * Busca el gasto con el monto más alto.
 *
 * @return gasto de mayor valor o {@code null} si la colección está vacía
 */
public gastos obtenerGastoMayor() {

    if (gastos.isEmpty()) {
        return null;
    }

    gastos mayor = gastos.get(0);

    // Se usa el primer gasto como referencia para comparar los demás.
    for (gastos gasto : gastos) {
        if (gasto.getmonto() > mayor.getmonto()) {
            mayor = gasto;
        }
    }

    return mayor;
}

/**
 * Muestra los gastos cuyo monto supera el valor indicado.
 *
 * @param montoMinimo límite inferior que debe superar cada gasto
 */
public void filtrarGastos(double montoMinimo) {

    boolean encontrado = false;

    for (gastos gasto : gastos) {

        if (gasto.getmonto() > montoMinimo) {

            System.out.println("Concepto: " + gasto.getconcepto());
            System.out.println("Monto: $" + gasto.getmonto());
            System.out.println("Categoria: " + gasto.getcategoria());
            System.out.println("----------------------");

            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("No hay gastos mayores a $" + montoMinimo);
    }
}

/**
 * Busca y muestra gastos cuyo concepto contiene el texto indicado.
 *
 * @param concepto texto que se desea buscar dentro del concepto del gasto
 */
public void buscarGastoPorConcepto(String concepto) {

    boolean encontrado = false;

    for (gastos gasto : gastos) {

        // La búsqueda ignora diferencias entre mayúsculas y minúsculas.
        if (gasto.getconcepto().toLowerCase().contains(concepto.toLowerCase())) {

            System.out.println("Concepto: " + gasto.getconcepto());
            System.out.println("Monto: $" + gasto.getmonto());
            System.out.println("Categoria: " + gasto.getcategoria());
            System.out.println("----------------------");

            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("No se encontraron gastos con ese concepto");
    }
}

}
