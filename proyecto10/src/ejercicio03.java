public class ejercicio03 {
    public static void main(String[] args) {
        int estudiantes = 28;
        String[] nombres = new String[estudiantes];
        double[][] notas = new double[estudiantes][3];
        double[] promedios = new double[estudiantes];

        for (int i = 0; i < estudiantes; i++) {
            nombres[i] = "Estudiante " + (i + 1);
            notas[i][0] = Math.random() * 10;
            notas[i][1] = Math.random() * 10;
            notas[i][2] = Math.random() * 10;
            promedios[i] = notas[i][0] * 0.35 + notas[i][1] * 0.35 + notas[i][2] * 0.30;
        }

        double promedioCurso = 0;
        for (double promedio : promedios) {
            promedioCurso += promedio;
        }
        promedioCurso /= estudiantes;

        System.out.println("Promedio del curso: " + promedioCurso);

        System.out.println("Estudiantes con promedio superior al promedio del curso:");
        for (int i = 0; i < estudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - " + promedios[i]);
            }
        }

        System.out.println("Estudiantes con promedio inferior al promedio del curso:");
        for (int i = 0; i < estudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - " + promedios[i]);
            }
        }

        int promedioMayor = 0, promedioMenor = 0;
        for (int i = 1; i < estudiantes; i++) {
            if (promedios[i] > promedios[promedioMayor]) promedioMayor = i;
            if (promedios[i] < promedios[promedioMenor]) promedioMenor = i;
        }

        System.out.println("Estudiante con mayor promedio: " + nombres[promedioMayor] + " - " + promedios[promedioMayor]);
        System.out.println("Estudiante con menor promedio: " + nombres[promedioMenor] + " - " + promedios[promedioMenor]);
    }
}
/**
 * Promedio del curso: 4.864532976840622
Estudiantes con promedio superior al promedio del curso:
Estudiante 2 - 6.949632523157437
Estudiante 7 - 5.55237688325041
Estudiante 8 - 6.102698640116576
Estudiante 10 - 5.1116572441557055
Estudiante 11 - 8.197418960285614
Estudiante 12 - 6.784372541006401
Estudiante 14 - 4.977594354718386
Estudiante 17 - 7.178729055706465
Estudiante 19 - 5.103783607510799
Estudiante 21 - 6.618968861789729
Estudiante 22 - 6.072557044359119
Estudiante 23 - 7.708901680423951
Estudiante 24 - 5.090721862395193
Estudiante 26 - 5.021606714490691
Estudiante 27 - 5.952679043929776
Estudiantes con promedio inferior al promedio del curso:
Estudiante 1 - 3.3009777155837665
Estudiante 3 - 2.8697042256841905
Estudiante 4 - 2.713629137601977
Estudiante 5 - 3.7238598349629015
Estudiante 6 - 3.8148414721805954
Estudiante 9 - 1.2175459394420132
Estudiante 13 - 4.4164557614025375
Estudiante 15 - 4.46909917614304
Estudiante 16 - 2.4885035174555714
Estudiante 18 - 3.7592056717473707
Estudiante 20 - 3.966136903236108
Estudiante 25 - 2.7919751302183777
Estudiante 28 - 4.2512898485827515
Estudiante con mayor promedio: Estudiante 11 - 8.197418960285614
Estudiante con menor promedio: Estudiante 9 - 1.2175459394420132
 */