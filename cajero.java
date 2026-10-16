/*
Teniendo en cuenta que esto es un paradigma estructurado, lo voy a hacer de la forma mas sencilla posible.

Usé en este caso el "switch" ya que es lo que mas se asimila a una solución que anteriormente
le había brindado a un caso similar que nos dejo el docente Arle
*/

import java.util.ArrayList;
import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> conceptos = new ArrayList<>();
        ArrayList<Double> montos = new ArrayList<>();
        ArrayList<String> categorias = new ArrayList<>();

        int opcion = 0; //la opción la dejo igual a 0 ya que lo primero que hace el while es verificar este número

        while (opcion != 7) {
            System.out.println("\nBienvenid@ \u00bfque quieres hacer hoy?\n");
            System.out.println("1. Registrar un gasto");
            System.out.println("2. Ver gastos");
            System.out.println("3. Total gastado");
            System.out.println("4. Ver mayor gasto");
            System.out.println("5. Ver gastos a partir de un precio");
            System.out.println("6. Buscar gasto por concepto");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Concepto: ");
                    conceptos.add(sc.nextLine());
                    System.out.print("Monto: ");
                    montos.add(sc.nextDouble());
                    sc.nextLine();
                    System.out.print("Categoria: ");
                    categorias.add(sc.nextLine());
                    System.out.println("gasto registrado.");
                    break;

                case 2:
                    System.out.println("Listado de gastos:");
                    for (int i = 0; i < conceptos.size(); i++) {
                        System.out.println((i + 1) + ". " + conceptos.get(i) + " - $" + montos.get(i) + " (" + categorias.get(i) + ")");
                    } //con un ciclo for recorro todos los elementos de conceptos, montos y categorías, así muestro facilmente todos los gastos
                    break;

                case 3:
                    double total = 0;
                    for (int i = 0; i < montos.size(); i++) {
                        total += montos.get(i);
                    }
                    System.out.println("Total gastado: $" + total);
                    break;

                case 4:
                    if (montos.isEmpty()) {
                        System.out.println("No hay gastos registrados.");
                    } else {
                        int posMayor = 0;
                        for (int i = 1; i < montos.size(); i++) {
                            if (montos.get(i) > montos.get(posMayor)) {
                                posMayor = i;
                            }
                        }
                        System.out.println("Mayor gasto: " + conceptos.get(posMayor) + " con $" + montos.get(posMayor));
                    }
                    break;

                case 5:
                    System.out.print("Ver gastos mayores o iguales a: $");
                    double minimo = sc.nextDouble();
                    sc.nextLine();
                    for (int i = 0; i < montos.size(); i++) {
                        if (montos.get(i) >= minimo) {
                            System.out.println("- " + conceptos.get(i) + ": $" + montos.get(i));
                        }
                    }
                    break;

                case 6:
                    System.out.print("Ingresa palabra a buscar: ");
                    String texto = sc.nextLine().toLowerCase();
                    for (int i = 0; i < conceptos.size(); i++) {
                        if (conceptos.get(i).toLowerCase().contains(texto)) {
                            System.out.println("- " + conceptos.get(i) + ": $" + montos.get(i) + " (" + categorias.get(i) + ")");
                        }
                    }
                    break;

                case 7:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opci\u00f3n inv\u00e1lida.");
                    break;
            }
        }

        sc.close();
    }
}

