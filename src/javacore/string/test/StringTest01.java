package javacore.string.test;

// String é imutável
// Heap é uma área dinâmica usada para alocação de objetos
public class StringTest01 {
    public static void main(String[] args) {

        // literais de string sempre são colocados automaticamente no String Pool
        // pool evita criação de cópias idênticas de string imutáveis
        String nome = "Mateus"; // String Constant Pool

        // aponta para "Mateus" no pool
        String nome2 = "Mateus";

        // nome = nome + " Batata";

        nome = nome.concat(" G.");

        System.out.println(nome);

        // "==" compara referências, e não conteúdo | equals() compara String
        System.out.println(nome == nome2);

        // 1. Usa o literal "Mateus" -> está no pool já
        // 2. Cria explicitamente um novo objeto String na heap via "new"
        String nome3 = new String("Mateus");

        // Comparação de referências entre Strings:
        // - nome2 aponta para a String literal no String Pool.
        // - nome3 foi criado com 'new', então está na Heap.
        // - intern() força nome3 a usar a referência do String Pool.
        // Assim, a primeira comparação (Pool vs Heap) é false,
        // e a segunda comparação (Pool vs Pool) é true.
        System.out.println("Pool  vs Heap  : nome2 == nome3           -> " + (nome2 == nome3));
        System.out.println("Pool  vs Pool  : nome2 == nome3.intern()  -> " + (nome2 == nome3.intern()));
    }
}
