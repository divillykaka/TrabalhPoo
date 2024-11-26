import java.util.ArrayList;


public class Sala {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        Disciplina disciplina1 = new Disciplina("Programação Orientada a objetos", "N111", 1);
        Disciplina disciplina2 = new Disciplina("Cálculo IV","N112", 2);
        Disciplina disciplina3 = new Disciplina("Matematica para computação","N113", 3);

        Regular regular1 = new Regular("joão", "0000.2222.3333-65", 21, 233321);
        Regular regular2 = new Regular("Bia", "1111.2222.3333-99", 22, 333335);
        Bolsistas bolsista1 = new Bolsistas("Kauan", "0000.3333.5555-99", 19, 856787);
        Regular regular3 = new Regular("Gabriel", "7777.1111.3333-77", 20, 4444295);
        Regular regular4 = new Regular("Vitor", "2222.5555.6666-21", 19, 1987601);
        Bolsistas bolsista2 = new Bolsistas("Kauã", "4444.6666.9999-44",25, 3307683);
        Regular regular5 = new Regular("Gabriela", "5555.8888.7777-11", 23, 9988712);
        Regular regular6 = new Regular("Helena", "2222.4444,9999-99", 22, 6543155);
        Bolsistas bolsista3 = new Bolsistas("Sarah", "7777.1111.2222-88", 20, 9876532);

        Professor professor = new Professor("Sr. Julio", "9999.5555.7777-88", 44, "Centro de Tecnologia");
        Professor professor2 = new Professor("Sr. Douglas", "3421.6542.6754-76", 55, "Centro de Tecnologia");
        Professor professor3 = new Professor("Sr. Diógenes", "7654.9764.1234-98", 43, "Centro de Tecnologia");

        Visitante visitante1 = new Visitante("Pedro", "7777.6666.3333-00", 19);
        Visitante visitante2 = new Visitante("Rubens", "4444.2222.3563-66", 19);


        Turma turma1 = new Turma(professor, disciplina1, 99766);
        turma1.adicionarAluno(regular1);
        turma1.adicionarAluno(regular2);
        turma1.adicionarAluno(bolsista1);
        turma1.listarAlunos();
        turma1.listarInformacoes();

        Turma turma2 = new Turma(professor2, disciplina2, 87453);
        turma2.adicionarAluno(regular3);
        turma2.adicionarAluno(regular4);
        turma2.adicionarAluno(bolsista2);
        turma2.listarAlunos();
        turma2.listarInformacoes();

        Turma turma3 = new Turma(professor3, disciplina3, 23412);
        turma3.adicionarAluno(regular5);
        turma3.adicionarAluno(regular6);
        turma3.adicionarAluno(bolsista3);
        turma3.listarAlunos();
        turma3.listarInformacoes();

    }
}
