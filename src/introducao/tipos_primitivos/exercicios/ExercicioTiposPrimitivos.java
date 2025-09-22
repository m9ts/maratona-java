package introducao.tipos_primitivos.exercicios;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>: confirmo que recebi o salário de <salario>, na data <data>
 */

import java.util.Date;

public class ExercicioTiposPrimitivos {
    public static void main(String[] args) {
        String Nome = "Mateus";
        String endereco = "Rua Netuno - Via Láctea";
        double salario = 2500.00;
        String dataRecebimentoSalario = "25/10/2028";
        String relatorio = "Eu, " + Nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
