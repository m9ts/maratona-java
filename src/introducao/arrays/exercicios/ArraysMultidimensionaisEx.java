package introducao.arrays.exercicios;

public class ArraysMultidimensionaisEx {
    public static void main(String[] args) {
//        Crie um programa que realiza a soma de duas matrizes e armazene o resultado em uma terceira matriz

        int[][] array1 = {{1, 2, 3}, {4, 5, 6}}; // 2 linhas x 3 colunas
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}}; // 2 linhas x 3 colunas
        int[][] somaMatrizes = new int[2][3];

        for (int i = 0; i < array1.length; i++) { // array1.length = 2 -> pois há 2 linhas
//            i assume os valores 0 e 1 | i = 0 -> [1, 2, 3] e i = 1 -> [4, 5, 6]
            for (int j = 0; j < array1[i].length; j++) { // array2.length = 3 -> pois há 3 colunas
//                j assume os valores 0, 1 e 2
//                j = 0 -> array1[i][0] | acessa o primeiro número da linha
//                j = 1 -> array1[i][1] | acessa o segundo número da linha
//                j = 2 -> array1[i][2] | acessa o terceiro número da linha

                somaMatrizes[i][j] = array1[i][j] + array2[i][j];
                System.out.println(somaMatrizes[i][j]);
            }
        }
    }
}
