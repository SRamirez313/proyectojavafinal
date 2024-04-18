
package proyectozoo;

import javax.swing.JOptionPane;

class Evento {
    String nombre;
    String fecha;
    String id;
    String descripcion;

    public Evento(String nombre, String fecha, String id, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
    }

   
    public String toString() {
        return "Nombre: " + nombre + ", Fecha: " + fecha + ", ID: " + id + ", Descripción: " + descripcion;
    }
}

public class evento {
    private static Evento evento1;
    private static Evento evento2;
    private static Evento evento3;

    
    
    public static void ejecutarPrograma() {
        String[] opciones = {"Registrar Evento", "Mostrar Todos", "Salir"};

        int opcionSeleccionada;
        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Registro de Eventos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    // Registrar Evento
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento:");
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha del evento:");
                    String id = JOptionPane.showInputDialog("Ingrese el ID del evento:");
                    String descripcion = JOptionPane.showInputDialog("Ingrese una descripción del evento:");

                    if (evento1 == null) {
                        evento1 = new Evento(nombre, fecha, id, descripcion);
                    } else if (evento2 == null) {
                        evento2 = new Evento(nombre, fecha, id, descripcion);
                    } else if (evento3 == null) {
                        evento3 = new Evento(nombre, fecha, id, descripcion);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden registrar más eventos. Capacidad máxima alcanzada.");
                    }

                    JOptionPane.showMessageDialog(null, "Evento registrado correctamente.");
                    break;
                case 1:
                    // Mostrar Todos
                    StringBuilder listaCompleta = new StringBuilder("Eventos registrados:\n");
                    if (evento1 != null)
                        listaCompleta.append(evento1.toString()).append("\n");
                    if (evento2 != null)
                        listaCompleta.append(evento2.toString()).append("\n");
                    if (evento3 != null)
                        listaCompleta.append(evento3.toString()).append("\n");
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
