import java.util.*;
public class ejercicio1 {

    public static void main(String[] args) {
        int valores[][] = new int[5][5];
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                valores[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                System.out.print(valores[i][j] + "\t");
            }
            System.out.println();
        }
        //diagonal principal
        System.out.println("Notas de la diagonal principal ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i][i] + "\t");
        }
        //diagonal secundaria
        System.out.println("\nNotas de la diagonal secundaria ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i][valores.length - 1 - i] + "\t");
        }
        //bajo la diagonal 
        System.out.println("\nNotas bajo la diagonal  principal ");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(valores[i][j] + "\t");
            }
        }
        //sobre la diagonal principal
        System.out.println("\nValores sobre la diagonal  principal");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 1 + 1; j < valores[0].length; j++) {
                System.out.print(valores[i][j] + "\t");
            }
        }
        //bajo la diagonalsecundaria
        System.out.println("\n Valores bajo la diagonal secundaria");
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length - 1 - i; j++) {
                System.out.print(valores[i][j] + "\t");
            }
        }
        //sobre la diagonal secundaria
        System.out.println("\n Valores sobre la diagonal secundaria");
        for (int i = 0; i < valores.length; i++) {
            for (int j = valores.length - 1 - i + 1; j < valores.length; j++) {
                System.out.print(valores[i][j] + "\t");
            }
        }
    }
}
/***
 * 0	6	3	9	0	
8	3	3	2	5	
5	1	3	4	3	
3	5	6	8	2	
3	6	2	0	0	
Notas de la diagonal principal 
0	3	3	8	0	
Notas de la diagonal secundaria 
0	2	3	5	3	
Notas bajo la diagonal  principal 
8	5	1	3	5	6	3	6	2	0	
Valores sobre la diagonal  principal
3	9	0	3	2	5	3	4	3	6	8	2	2	0	0	
 Valores bajo la diagonal secundaria
0	6	3	9	8	3	3	5	1	3	
 Valores sobre la diagonal secundaria
5	4	3	6	8	2	6	2	0	0	BUILD SUCCESSFUL (total time: 0 seconds)

 */