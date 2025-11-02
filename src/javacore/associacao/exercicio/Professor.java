package javacore.associacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Professor: " + this.nome + "\nEspecialidade: " + this.especialidade);

        if (this.seminarios == null) return;
        System.out.println("\nSEMINÁRIO(S) CADASTRADO(S)");

        for (Seminario seminario : this.seminarios) {
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("\nALUNOS:");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " + aluno.getNome() + "\nIdade: " + aluno.getIdade());
            }
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
