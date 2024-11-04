import java.util.ArrayList;

public class Sala {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos; alunos = new ArrayList<>();

        Disciplina discp1 = new Disciplina("Programação Orientada a objetos");
        Disciplina discp2 = new Disciplina("Cálculo IV");
        Disciplina discp3 = new Disciplina("Matematica para computação");

    Regular regular1 = new Regular("joazin", "0000.2222.3333-65", 21, 233321);
    Regular regular2 = new Regular("Bia", "1111.2222.3333-99", 22, 333335);
    Bolsistas bolsist1 = new Bolsistas("Kauan", "0000.3333.5555-99", 19, 856787);

    Professor prof1 = new Professor("Sr. Julio", "9999.5555.7777-88", 44);

    Visitante visit1 = new Visitante("Pedro", "7777.6666.3333-00", 19);
    Visitante visit2 = new Visitante("Sarah", "4444.2222.1111-66", 19);

    Aluno alun1 = new Aluno("Josue","8888.6666.4444-00", 22, 6654464);
    Aluno alun2 = new Aluno("Tauan", "3333.2222.5555-66", 21, 3321102);
    Aluno alun3 = new Aluno("Lucas", "1111.2222.4444-99", 20, 2098849);
    Aluno alun4 = new Aluno("Gabriel", "7777.1111.3333-77", 20, 4444295);
    Aluno alun5 = new Aluno("Vitor", "2222.5555.6666-21", 19, 1987601);
    Aluno alun6 = new Aluno("Kauã", "4444.6666.9999-44",25, 3307683);
    Aluno alun7 = new Aluno("Gabriela", "5555.8888.7777-11", 23, 9988712);
    Aluno alun8 = new Aluno("Helena", "2222.4444,9999-99", 22, 6543155);
    Aluno alun9 = new Aluno("Sarah", "7777.1111.2222-88", 20, 9876532);

    Turma turma2 = new Turma("Sr.Douglas", "Matematica para computação", 87453);

    turma2.adicionarAluno(alun1);
    turma2.adicionarAluno(alun2);
    turma2.adicionarAluno(alun3);
    turma2.listaDeAlunos();
    turma2.turma();

    Turma turma1 = new Turma("Sr.Alberto", "POO", 99766);

    turma1.adicionarAluno(alun6);
    turma1.adicionarAluno(alun4);
    turma1.adicionarAluno(alun5);
    turma1.listaDeAlunos();
    turma1.turma();

    Turma turma3 = new Turma("Sra.Luciana", "Cálculo IV", 23412);

    turma3.adicionarAluno(alun7);
    turma3.adicionarAluno(alun8);
    turma3.adicionarAluno(alun9);
    turma3.listaDeAlunos();
    turma3.turma();





        }
    }
