import java.util.ArrayList;

public class Turma {
    String professor;
    String disciplina;
    String aluno;
    int codigo;

    ArrayList<Aluno> alunos;

    public Turma(String professor, String disciplina, int codigo) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.codigo = codigo;
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);

    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);

    }

    public void listaDeAlunos() {
        System.out.println("lista de alunos na sala:");
        for (Aluno aluno : alunos) {
            aluno.exibirdados();
        }
    }
    public void turma(){
        System.out.println("professor:" + professor + " Disciplina:"+ disciplina + " Codigo:" + codigo + "\n");
    }
}
