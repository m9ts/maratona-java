package introducao.estruturas_repeticao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
//        While, do while, for

        int count = 0;
//        Para evitar loop infinito, é necessário trocar a condição da variável
        while (count < 10) {
            System.out.println(++count);
        }

//        Do-while executa o loop pelo menos uma vez, sendo true ou false
        count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

//        For é indexado (índice); utilizado para percorrer listas; ideia de contagem
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i: " + i);
        }
    }
}
