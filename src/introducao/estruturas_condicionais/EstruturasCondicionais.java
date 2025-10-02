package introducao.estruturas_condicionais;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado(a) a comprar bebida alcoólica");
        }else{
            System.out.println("Não autorizado(a) a comprar bebida alcoólica!");
        }

////      if (!isAutorizadoComprarBebida)
//        if (isAutorizadoComprarBebida == false) {
//            System.out.println("Não autorizado(a) a comprar bebida alcoólica!");
//        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
    }
}
