package poo;

import java.util.Scanner;

/**
 * Ejecuta el menú interactivo del sistema de control de gastos.
 */
public class main {

    /**
     * Inicia la aplicación y procesa las opciones elegidas por el usuario.
     *
     * @param args argumentos de línea de comandos; no se utilizan
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestorGastos gestor = new GestorGastos();

        int opcion;

        do {
            System.out.println("\n===== CONTROL DE GASTOS =====");
            System.out.println("1. Registrar gasto");
            System.out.println("2. Mostrar todos los gastos");
            System.out.println("3. Calcular gasto total");
            System.out.println("4. Mostrar gasto de mayor valor");
            System.out.println("5. Filtrar gastos por monto");
            System.out.println("6. Buscar gasto por concepto");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            // Consume el salto de línea pendiente antes de leer texto.
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el concepto: ");
                    String concepto = scanner.nextLine();

                    System.out.print("Ingrese el monto: ");
                    double monto = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Ingrese la categoria: ");
                    String categoria = scanner.nextLine();

                    gastos nuevoGasto = new gastos(concepto, monto, categoria);
                    gestor.registrarGasto(nuevoGasto);

                    System.out.println("Gasto registrado correctamente");
                    break;

                case 2:
                    gestor.mostrarGastos();
                    break;

                case 3:
                    System.out.println("Total acumulado: $" + gestor.calcularTotal());
                    break;

                case 4:
                    gastos mayor = gestor.obtenerGastoMayor();

                    if (mayor != null) {
                        System.out.println("Concepto: " + mayor.getconcepto());
                        System.out.println("Monto: $" + mayor.getmonto());
                        System.out.println("Categoria: " + mayor.getcategoria());
                    } else {
                        System.out.println("No hay gastos registrados");
                    }
                    break;

                case 5:
                    System.out.print("Ingrese el monto minimo: ");
                    double minimo = scanner.nextDouble();
                    scanner.nextLine();

                    gestor.filtrarGastos(minimo);
                    break;

                case 6:
                    System.out.print("Ingrese el concepto a buscar: ");
                    String busqueda = scanner.nextLine();

                    gestor.buscarGastoPorConcepto(busqueda);
                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 7);

        scanner.close();
    }
}
