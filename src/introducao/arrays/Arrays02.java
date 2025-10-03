package introducao.arrays;

public class Arrays02 {
    public static void main(String[] args) {
//        Inicialização padrão dos tipos
//        byte, short, int, long, float e double = 0
//        char '\u0000' -> ' '
//        boolean -> false
//        String -> null

        String[] nomes = new String[4];
        nomes[0] = "Bianca";
        nomes[1] = "Cleiton";
        nomes[2] = "Mateus";
        nomes[3] = "Júlia";

//        O valor do Array não muda dinamicamente, deve ser feito manualmente - por enquanto
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            System.out.println("----------");
        }
    }
}
