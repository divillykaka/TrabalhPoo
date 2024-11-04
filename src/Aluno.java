public class Aluno extends Pessoa{
int matricula;

public Aluno(String nome, String cpf, int idade, int matricula){
    super(nome, cpf, idade);
    this.matricula = matricula;

        }
    public void exibirdados() {
        System.out.println("NOME:" + nome + "\nCPF:" + cpf + "\nIDADE:" + idade + "\nMatrícula:" + matricula + "\n");
    }

}

