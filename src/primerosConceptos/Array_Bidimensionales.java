package primerosConceptos;

public class Array_Bidimensionales {
    public static void maim(String[] args) {
        int[][] arr_bi = new int[4][5];

        arr_bi[0][0] = 15;
        arr_bi[0][1] = 21;
        arr_bi[0][2] = 18;
        arr_bi[0][3] = 9;
        arr_bi[0][4] = 15;

        arr_bi[1][0] = 10;
        arr_bi[1][1] = 52;
        arr_bi[1][2] = 17;
        arr_bi[1][3] = 19;
        arr_bi[1][4] = 7;

        arr_bi[2][0] = 19;
        arr_bi[2][1] = 2;
        arr_bi[2][2] = 19;
        arr_bi[2][3] = 17;
        arr_bi[2][4] = 7;

        arr_bi[3][0] = 92;
        arr_bi[3][1] = 13;
        arr_bi[3][2] = 13;
        arr_bi[3][3] = 32;
        arr_bi[3][4] = 41;

        int[][] matrix = {
                { 10, 15, 18, 19, 21 },
                { 5, 25, 37, 41, 15 },
                { 7, 19, 32, 14, 90 },
                { 85, 2, 7, 40, 27 },
        };

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(arr_bi[i][j] + " ");

            }
        }

        System.out.println();

        for (int[] fila : matrix) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z + " ");
            }
        }
    }

}
