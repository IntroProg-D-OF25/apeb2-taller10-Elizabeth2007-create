import java.util.Scanner;

public class ejercicio04 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        
        String[][] inventario = new String[100][3];
        int numeroProductos = 0; // Contador de productos

        while (true) {
            System.out.println("\n--- Menú de Gestión de Inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = tcl.nextInt();
            tcl.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (numeroProductos < inventario.length) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = tcl.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        String precio = tcl.nextLine();
                        System.out.print("Ingrese la cantidad del producto: ");
                        String cantidad = tcl.nextLine();

                        inventario[numeroProductos][0] = nombre;
                        inventario[numeroProductos][1] = precio;
                        inventario[numeroProductos][2] = cantidad;
                        numeroProductos++;

                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("El inventario está lleno.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizar = tcl.nextLine();
                    boolean encontradoActualizar = false;

                    for (int i = 0; i < numeroProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreActualizar)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            String nuevaCantidad = tcl.nextLine();
                            inventario[i][2] = nuevaCantidad;
                            System.out.println("Cantidad actualizada exitosamente.");
                            encontradoActualizar = true;
                            break;
                        }
                    }

                    if (!encontradoActualizar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBuscar = tcl.nextLine();
                    boolean encontradoBuscar = false;

                    for (int i = 0; i < numeroProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreBuscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            encontradoBuscar = true;
                            break;
                        }
                    }

                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreEliminar = tcl.nextLine();
                    boolean encontradoEliminar = false;

                    for (int i = 0; i < numeroProductos; i++) {
                        if (inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                            // Mover los elementos hacia atrás para llenar el hueco
                            for (int j = i; j < numeroProductos - 1; j++) {
                                inventario[j][0] = inventario[j + 1][0];
                                inventario[j][1] = inventario[j + 1][1];
                                inventario[j][2] = inventario[j + 1][2];
                            }
                            numeroProductos--;
                            System.out.println("Producto eliminado exitosamente.");
                            encontradoEliminar = true;
                            break;
                        }
                    }

                    if (!encontradoEliminar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("\nInventario actual:");
                    for (int i = 0; i < numeroProductos; i++) {
                        System.out.println((i + 1) + ". Nombre: " + inventario[i][0] + ", Precio: " + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
/***
 * --- Men� de Gesti�n de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opci�n: 1
Ingrese el nombre del producto: gelatina
Ingrese el precio del producto: café
Ingrese la cantidad del producto: jabón
Producto agregado exitosamente.

--- Men� de Gesti�n de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opci�n: 2
Ingrese el nombre del producto a actualizar: jabón
Producto no encontrado.

--- Men� de Gesti�n de Inventario ---
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Mostrar inventario
6. Salir
Seleccione una opci�n: 6
Saliendo del programa
 */