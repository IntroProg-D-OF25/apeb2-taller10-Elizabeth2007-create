import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {

        // Variables
        String[] nombres = {"Producto A", "Producto B", "Producto C", "Producto D"};
        int[] precios = {25, 30, 40, 50};
        int[] cantidades = {50, 20, 10, 0};

        int index, cantidadDisponible, cantidadCompra;
        String nombreProducto;
        float precioProducto, totalCompra, totalConIva;
        
        Scanner scanner = new Scanner(System.in);
        float iva = 0.15f;
        float descuento = 0.1f;

        // Proceso

        System.out.println("Sistema de facturacion de una tienda");
        System.out.println("======================================");
        
        System.out.print("Ingrese el código del producto (1-4): ");
        int codigoProducto = scanner.nextInt();
        
        if (codigoProducto < 1 || codigoProducto > 4) {
            System.out.println("Producto no válido.");
            return;
        }
        
        index = codigoProducto - 1;
        nombreProducto = nombres[index];
        precioProducto = precios[index];
        cantidadDisponible = cantidades[index];
        
        if (cantidadDisponible == 0) {
            System.out.println("Producto fuera de stock.");
            return;
        }
        
        System.out.print("Ingrese la cantidad a comprar: ");
        cantidadCompra = scanner.nextInt();
        
        if (cantidadCompra > cantidadDisponible) {
            System.out.println("No hay suficientes existencias.");
            return;
        }
        
        totalCompra = precioProducto * cantidadCompra;
        totalConIva = totalCompra + (totalCompra * iva);
        
        if (totalConIva > 100) {
            totalConIva = totalConIva - (totalConIva * descuento);
        }
        
        System.out.println("Factura:");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidadCompra);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Total sin IVA: $" + totalCompra);
        System.out.println("IVA (15%): $" + (totalCompra * iva));
        System.out.println("Total con IVA: $" + totalConIva);
    }
}
/***
 * Sistema de facturacion de una tienda
======================================
Ingrese el c�digo del producto (1-4): 3
Ingrese la cantidad a comprar: 4
Factura:
Producto: Producto C
Cantidad: 4
Precio unitario: $40.0
Total sin IVA: $160.0
IVA (15%): $24.0
Total con IVA: $165.6
 */