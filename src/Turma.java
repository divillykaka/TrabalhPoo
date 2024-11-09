import java.util.ArrayList;

public class Turma {
    private final Professor professor;
    private final Disciplina disciplina;
    private final int codigo;
    ArrayList<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina, int codigo, ArrayList<Aluno> alunos) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.codigo = codigo;
        this.alunos = alunos;
    }

    public void adicionarAluno(Aluno aluno) { alunos.add(aluno); }

    public void removerAluno(Aluno aluno) { alunos.remove(aluno); }

    public void listarAlunos() {
        System.out.println("Lista de alunos na sala:");

        for (Aluno aluno : alunos) { aluno.exibirdados(); }
    }

    public void listarInformacoes(){
        System.out.println("Professor: " + professor.getNome() + "\nDisciplina: "+ disciplina.nome + "\nCodigo: " + codigo + "\n");
        System.out.println("============================================= \n");
    }
}
