package introducao.estruturas_condicionais;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 - Categoria infantil
        // idade >= 15 && idade < 18 - Categoria juvenil
        // idade >= 18 - Categoria adulto

        // Variáveis locais, antes de serem utilizadas, precisam ser inicializadas - ou ocorrerá erro de compilação.
        int idade = 20;
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil.";
        }else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil.";
        }else{
            categoria = "Categoria adulto.";
        }

//        Utilizando ternário (não recomendado)
        categoria = idade < 15 ? "Categoria infantil." : idade >= 15 && idade < 18 ? "Categoria juvenil." : "Categoria adulto.";
        System.out.println(categoria);
    }
}
