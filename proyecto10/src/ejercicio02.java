public class ejercicio02 {
    public static void main(String[] args) {
        int filas = 3, columnas = 3;
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }

        
        System.out.println("Matriz 1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma de matrices:");
        int[][] suma = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplicación de matrices:");
        int[][] producto = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < columnas; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                System.out.print(producto[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/***
 * run:
Matriz 1:
8 5 1 
4 5 2 
5 8 3 
Matriz 2:
2 7 1 
2 1 7 
4 7 6 
Suma de matrices:
10 12 2 
6 6 9 
9 15 9 
Multiplicaci�n de matrices:
30 68 49 
26 47 51 
38 64 79 
 */