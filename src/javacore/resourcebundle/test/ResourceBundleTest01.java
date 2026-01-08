package javacore.resourcebundle.test;
/*
- Classe fundamental para internacionalização e localização de apps;
- Conjunto de arquivos (.properties) com mensagens específicas para cada localidade;
- Em tempo de execução, o ResourceBundle carrega automaticamente o arquivo de recurso apropriado com base no Locale
atual do usuário ou do sistema.
*/
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("oi"));
        System.out.println(bundle.getString("bd"));

        bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(bundle.getString("oi"));
        System.out.println(bundle.getString("bd"));

//        System.out.println(bundle.getString("hi"));
    }
}
