package introducao.arrays;

public class Arrays03 {
    public static void main(String[] args) {
//        Formas de inicializar um array
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};
        String[] nomes = {"Mateus", "Lúcio", "Júlia", "Izza"};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }

//        For each
//        num percorre todos os valores do array numeros3
        for (int num : numeros3) {
            System.out.println(num);
        }

        for (String a : nomes) {
            System.out.println(a);
        }
    }
}
