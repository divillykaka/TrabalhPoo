
import java.util.ArrayList;


public class Sala {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Programação Orientada a objetos", "N111", 1);
        Disciplina disciplina2 = new Disciplina("Cálculo IV","N112", 2);
        Disciplina disciplina3 = new Disciplina("Matematica para computação","N113", 3);

        Regular regular1 = new Regular("joazin", "0000.2222.3333-65", 21, 233321);
        Regular regular2 = new Regular("Bia", "1111.2222.3333-99", 22, 333335);
        Bolsistas bolsista1 = new Bolsistas("Kauan", "0000.3333.5555-99", 19, 856787);

        Professor professor = new Professor("Sr. Julio", "9999.5555.7777-88", 44, "Centro de Tecnologia");

        Visitante visitante1 = new Visitante("Pedro", "7777.6666.3333-00", 19);
        Visitante visitante2 = new Visitante("Sarah", "4444.2222.1111-66", 19);

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Turma turma1 = new Turma(professor, disciplina1, 99766, alunos);
        Turma turma2 = new Turma(professor, disciplina2, 87453, alunos);
        Turma turma3 = new Turma(professor, disciplina3, 23412, alunos);

        turma1.adicionarAluno(regular1);
        turma1.adicionarAluno(regular2);
        turma1.adicionarAluno(bolsista1);
        turma1.listarAlunos();
        turma1.listarInformacoes();

        turma2.adicionarAluno(regular1);
        turma2.adicionarAluno(regular2);
        turma2.adicionarAluno(bolsista1);
        turma2.listarAlunos();
        turma2.listarInformacoes();

        turma3.adicionarAluno(regular1);
        turma3.adicionarAluno(regular2);
        turma3.adicionarAluno(bolsista1);
        turma3.listarAlunos();
        turma3.listarInformacoes();
    }
}
