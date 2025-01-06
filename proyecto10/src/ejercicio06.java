import java.util.Scanner;

public class ejercicio06 {
    public static void main(String[] args) {

        // Variables
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char jugador = 'X';
        int fila, columna;
        boolean juegoTerminado = false, empate;

        Scanner sc = new Scanner(System.in);


        // Proceso
        
        System.out.println("Juego de Tres en Raya");
        System.out.println("=====================");
        
        while (!juegoTerminado) {
            
            System.out.println("-------------");
            for (int i = 0; i < 3; i++) {
                System.out.println("| " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2] + " |");
                System.out.println("-------------");
            }
            
            System.out.println("Turno del jugador " + jugador);
            
            System.out.print("Ingrese fila (0-2): ");
            fila = sc.nextInt();
            System.out.print("Ingrese columna (0-2): ");
            columna = sc.nextInt();
            
            if (tablero[fila][columna] != ' ') {
                System.out.println("Celda ocupada. Intente de nuevo.");
                continue;
            }
            
            tablero[fila][columna] = jugador;
            
            boolean ganador = false;
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                    ganador = true;
                    break;
                }
                if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                    ganador = true;
                    break;
                }
            }
            if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
                ganador = true;
            }
            if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
                ganador = true;
            }
            
            if (ganador) {
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.println("| " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2] + " |");
                    System.out.println("-------------");
                }
                System.out.println("¡El jugador " + jugador + " ha ganado!");
                juegoTerminado = true;
                continue;
            }
            
            empate = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        empate = false;
                        break;
                    }
                }
                if (!empate) {
                    break;
                }
            }
            
            if (empate) {
                System.out.println("-------------");
                for (int i = 0; i < 3; i++) {
                    System.out.println("| " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2] + " |");
                    System.out.println("-------------");
                }
                System.out.println("¡Es un empate!");
                juegoTerminado = true;
            }
            
            jugador = (jugador == 'X') ? 'O' : 'X';
        }
    }
}
/***
 * Juego de Tres en Raya
=====================
-------------
|   |   |   |
-------------
|   |   |   |
-------------
|   |   |   |
-------------
Turno del jugador X
Ingrese fila (0-2): 1
Ingrese columna (0-2): 1
-------------
|   |   |   |
-------------
|   | X |   |
-------------
|   |   |   |
-------------
Turno del jugador O
Ingrese fila (0-2): 2
Ingrese columna (0-2): 2
-------------
|   |   |   |
-------------
|   | X |   |
-------------
|   |   | O |
-------------
Turno del jugador X
Ingrese fila (0-2): 0
Ingrese columna (0-2): 1
-------------
|   | X |   |
-------------
|   | X |   |
-------------
|   |   | O |
-------------
Turno del jugador O
Ingrese fila (0-2): 2
Ingrese columna (0-2): 0
-------------
|   | X |   |
-------------
|   | X |   |
-------------
| O |   | O |
-------------
Turno del jugador X
Ingrese fila (0-2): 2
Ingrese columna (0-2): 1
-------------
|   | X |   |
-------------
|   | X |   |
-------------
| O | X | O |
-------------
�El jugador X ha ganado!
 */