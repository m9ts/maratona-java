package introducao.arrays;
// um array multidimensional é na verdade um conjunto de arrays dentro de arrays
// o array interno faz referências para os arrays externos
// cada índice representa uma posição em cada dimensão, ex: array[i][j].


public class ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Meses: 1, 2, 3, 4, 5
        // Dias: 31, 28, 31, 30

        // Array multidimensional
        int[][] dias = new int[3][3]; // 3 linhas x 3 colunas
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 33;
        dias[1][1] = 34;
        dias[1][2] = 35;

        for (int i = 0; i < dias.length; i++) { // laço externo que percorre as linhas
            for (int j = 0; j < dias[i].length; j++) { // laço interno que percorre as colunas
                System.out.println(dias[i][j]); // print de todos os elementos do array em ordem
            }
        }

        System.out.println("Endereço de memória: "+ dias[0]); // endereço de memória
        System.out.println("Valor: "+ dias[0][0]); // valor
    }
}
