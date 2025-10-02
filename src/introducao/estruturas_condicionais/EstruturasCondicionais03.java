package introducao.estruturas_condicionais;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
//        Doar se salario > 5000
        double salario = 3000;

//        Operador ternário -> (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar R$ 500,00 para a caridade." : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
