
package proyectozoo;

import javax.swing.JOptionPane;

class Habitat {
    private String nombre;
    private String tipoAmbiente;
    private int capacidad;

    public Habitat(String nombre, String tipoAmbiente, int capacidad) {
        this.nombre = nombre;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
    }

  
    public String toString() {
        return "Nombre: " + nombre + ", Tipo de Ambiente: " + tipoAmbiente + ", Capacidad: " + capacidad;
    }
}

public class habitat {
    private static Habitat habitat1;
    private static Habitat habitat2;
    private static Habitat habitat3;


    public static void ejecutarPrograma() {
        String[] opciones = {"Registrar Hábitat", "Mostrar Todos", "Salir"};

        int opcionSeleccionada;
        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Registro de Hábitats", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    // Registrar Hábitat
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del hábitat:");
                    String tipoAmbiente = JOptionPane.showInputDialog("Ingrese el tipo de ambiente del hábitat:");
                    int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del hábitat:"));

                    if (habitat1 == null) {
                        habitat1 = new Habitat(nombre, tipoAmbiente, capacidad);
                    } else if (habitat2 == null) {
                        habitat2 = new Habitat(nombre, tipoAmbiente, capacidad);
                    } else if (habitat3 == null) {
                        habitat3 = new Habitat(nombre, tipoAmbiente, capacidad);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden registrar más hábitats. Capacidad máxima alcanzada.");
                    }

                    JOptionPane.showMessageDialog(null, "Hábitat registrado correctamente.");
                    break;
                case 1:
                    // Mostrar Todos
                    StringBuilder listaCompleta = new StringBuilder("Hábitats registrados:\n");
                    if (habitat1 != null)
                        listaCompleta.append(habitat1.toString()).append("\n");
                    if (habitat2 != null)
                        listaCompleta.append(habitat2.toString()).append("\n");
                    if (habitat3 != null)
                        listaCompleta.append(habitat3.toString()).append("\n");
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
