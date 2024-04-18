
package proyectozoo;

import javax.swing.JOptionPane;

class RegistroAlimentacion {
    private String nombreAnimal;
    private String horario;
    private String alimento;

    public RegistroAlimentacion(String nombreAnimal, String horario, String alimento) {
        this.nombreAnimal = nombreAnimal;
        this.horario = horario;
        this.alimento = alimento;
    }

 
    public String toString() {
        return "Animal: " + nombreAnimal + ", Horario: " + horario + ", Alimento: " + alimento;
    }
}

public class alimentacion {
    private static RegistroAlimentacion registro1;
    private static RegistroAlimentacion registro2;
    private static RegistroAlimentacion registro3;

    public static void ejecutarPrograma() {
   
        String[] opciones = {"Registrar Alimentación", "Mostrar Todos", "Salir"};

        int opcionSeleccionada;
        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Registro de Alimentación", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    
                    String nombreAnimal = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
                    String horario = JOptionPane.showInputDialog("Ingrese el horario de alimentación:");
                    String alimento = JOptionPane.showInputDialog("Ingrese el alimento:");

                    if (registro1 == null) {
                        registro1 = new RegistroAlimentacion(nombreAnimal, horario, alimento);
                    } else if (registro2 == null) {
                        registro2 = new RegistroAlimentacion(nombreAnimal, horario, alimento);
                    } else if (registro3 == null) {
                        registro3 = new RegistroAlimentacion(nombreAnimal, horario, alimento);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pueden registrar más alimentaciones. Capacidad máxima alcanzada.");
                    }

                    JOptionPane.showMessageDialog(null, "Registro de alimentación realizado correctamente.");
                    break;
                case 1:
                    
                    StringBuilder listaCompleta = new StringBuilder("Registros de alimentación:\n");
                    if (registro1 != null)
                        listaCompleta.append(registro1.toString()).append("\n");
                    if (registro2 != null)
                        listaCompleta.append(registro2.toString()).append("\n");
                    if (registro3 != null)
                        listaCompleta.append(registro3.toString()).append("\n");
                    JOptionPane.showMessageDialog(null, listaCompleta.toString());
                    break;
                case 2:
                    
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionSeleccionada != opciones.length - 1);
    }
}

