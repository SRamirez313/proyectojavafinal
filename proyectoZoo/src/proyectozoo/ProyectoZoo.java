
package proyectozoo;

import javax.swing.JOptionPane;

public class ProyectoZoo {
    public static void main(String[] args) {
        
        String[] opciones = {"Registro de Animales", "Registro de Hábitats", "Registro de Eventos", "Registro de Visitantes", "Gestión de Alimentación", "Mapa de Animales", "Salir"};

        int opcionSeleccionada;
        do {
            
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    RegistroAnimales.ejecutarPrograma();
                      
                    break;
                case 1:
                    habitat.ejecutarPrograma(); 
                    
                    break;
                case 2:
                    evento.ejecutarPrograma();
                    
                    break;
                case 3:
                    
                    visitantes.ejecutarPrograma();        
                    break;
                case 4:
                       
                    alimentacion.ejecutarPrograma();    
                    break;
                case 5:
                    /* mapa de Animales */
                    
                    break;
                case 6:
                    
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionSeleccionada != opciones.length - 1);
    }
}

