
package proyectozoo;

import javax.swing.JOptionPane;

class Visitante {
    private String nombre;
    private int edad;
    private String fechaIngreso;

    public Visitante(String nombre, int edad, String fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Fecha de Ingreso: " + fechaIngreso;
    }
}

public class visitantes {
    private static Visitante visitante1;
    private static Visitante visitante2;
    private static Visitante visitante3;

    public static void ejecutarPrograma() {
        registrarYMostrarVisitantes();
    }

    private static void registrarYMostrarVisitantes() {
        String[] opciones = {"Registrar Visitante", "Mostrar Todos", "Salir"};

        int opcionSeleccionada;
        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Registro de Visitantes", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    // Registrar Visitante
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del visitante:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del visitante:"));
                    String fechaIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso del visitante:");

                    if (visitante1 == null) {
                        visitante1 = new Visitante(nombre, edad, fechaIngreso);
                    } else if (visitante2 == null) {
                        visitante2 = new Visitante(nombre, edad, fechaIngreso);
                    } else if (visitante3 == null) {
                        visitante3 = new Visitante(nombre, edad, fechaIngreso);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden registrar más visitantes. Capacidad máxima alcanzada.");
                    }

                    JOptionPane.showMessageDialog(null, "Visitante registrado correctamente.");
                    break;
                case 1:
                    // Mostrar Todos
                    StringBuilder listaCompleta = new StringBuilder("Visitantes registrados:\n");
                    if (visitante1 != null)
                        listaCompleta.append(visitante1.toString()).append("\n");
                    if (visitante2 != null)
                        listaCompleta.append(visitante2.toString()).append("\n");
                    if (visitante3 != null)
                        listaCompleta.append(visitante3.toString()).append("\n");
                    JOptionPane.showMessageDialog(null, listaCompleta.toString());
                    break;
                case 2:
                    // Salir
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionSeleccionada != opciones.length - 1);
    }
}
