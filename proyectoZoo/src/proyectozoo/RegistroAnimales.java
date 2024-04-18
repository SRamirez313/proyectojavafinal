
package proyectozoo;

import javax.swing.JOptionPane;

class Animal {
    String nombre;
    String especie;
    int edad;
    String habitat;

    public Animal(String nombre, String especie, int edad, String habitat) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.habitat = habitat;
    }

   
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie + ", Edad: " + edad + ", Hábitat: " + habitat;
    }
}

public class RegistroAnimales {
    private static Animal animal1 = new Animal("Leon", "felino", 5, "Savana");
    private static Animal animal2 = new Animal("Elefante", "elefante", 10, "Savana");
    private static Animal animal3 = new Animal("Tigre", "felino", 7, "Jungla");

    public static void ejecutarPrograma() {
        String[] opciones = {"Añadir Animal", "Eliminar Animal", "Modificar Animal", "Buscar Animal", "Mostrar Todos", "Volver"};

        int opcionSeleccionada;
        do {
            opcionSeleccionada = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Registro de Animales", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            switch (opcionSeleccionada) {
                case 0:
                    
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del animal:");
                    String especie = JOptionPane.showInputDialog("Ingrese la especie del animal:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del animal:"));
                    String habitat = JOptionPane.showInputDialog("Ingrese el hábitat del animal:");
                    JOptionPane.showMessageDialog(null, "Animal añadido correctamente.");
                    break;
                case 1:
                    String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre del animal a eliminar:");
                    boolean eliminado = false;
                    if (animal1 != null && animal1.nombre.equalsIgnoreCase(nombreEliminar)) {
                        animal1 = null;
                        eliminado = true;
                    } else if (animal2 != null && animal2.nombre.equalsIgnoreCase(nombreEliminar)) {
                        animal2 = null;
                        eliminado = true;
                    } else if (animal3 != null && animal3.nombre.equalsIgnoreCase(nombreEliminar)) {
                        animal3 = null;
                        eliminado = true;
                    }
                    if (eliminado)
                        JOptionPane.showMessageDialog(null, "Animal eliminado correctamente.");
                    else
                        JOptionPane.showMessageDialog(null, "No se encontró el animal a eliminar.");
                   
                    break;
                case 2:
                    String nombreModificar = JOptionPane.showInputDialog("Ingrese el nombre del animal a modificar:");
                    boolean encontrado = false;
                    if (animal1 != null && animal1.nombre.equalsIgnoreCase(nombreModificar)) {
                        animal1.especie = JOptionPane.showInputDialog("Ingrese la nueva especie del animal:");
                        animal1.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del animal:"));
                        animal1.habitat = JOptionPane.showInputDialog("Ingrese el nuevo hábitat del animal:");
                        encontrado = true;
                    } else if (animal2 != null && animal2.nombre.equalsIgnoreCase(nombreModificar)) {
                        animal2.especie = JOptionPane.showInputDialog("Ingrese la nueva especie del animal:");
                        animal2.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del animal:"));
                        animal2.habitat = JOptionPane.showInputDialog("Ingrese el nuevo hábitat del animal:");
                        encontrado = true;
                    } else if (animal3 != null && animal3.nombre.equalsIgnoreCase(nombreModificar)) {
                        animal3.especie = JOptionPane.showInputDialog("Ingrese la nueva especie del animal:");
                        animal3.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad del animal:"));
                        animal3.habitat = JOptionPane.showInputDialog("Ingrese el nuevo hábitat del animal:");
                        encontrado = true;
                    }
                    if (encontrado)
                        JOptionPane.showMessageDialog(null, "Animal modificado correctamente.");
                    else
                        JOptionPane.showMessageDialog(null, "No se encontró el animal a modificar.");
                    break;
                    
                case 3:
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del animal a buscar:");
                    Animal animalBuscado = null;
                    if (animal1 != null && animal1.nombre.equalsIgnoreCase(nombreBuscar)) {
                        animalBuscado = animal1;
                    } else if (animal2 != null && animal2.nombre.equalsIgnoreCase(nombreBuscar)) {
                        animalBuscado = animal2;
                    } else if (animal3 != null && animal3.nombre.equalsIgnoreCase(nombreBuscar)) {
                        animalBuscado = animal3;
                    }
                    if (animalBuscado != null)
                        JOptionPane.showMessageDialog(null, "Animal encontrado:\n" + animalBuscado.toString());
                    else
                        JOptionPane.showMessageDialog(null, "No se encontró el animal buscado.");
                    
                    break;
                    
                case 4:
                    StringBuilder listaCompleta = new StringBuilder("Animales en el zoológico:\n");
                    if (animal1 != null)
                        listaCompleta.append(animal1.toString()).append("\n");
                    if (animal2 != null)
                        listaCompleta.append(animal2.toString()).append("\n");
                    if (animal3 != null)
                        listaCompleta.append(animal3.toString()).append("\n");
                    JOptionPane.showMessageDialog(null, listaCompleta.toString());
                    break;
                case 5:
                    // Volver al menú principal
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcionSeleccionada != opciones.length - 1);
    }
}
