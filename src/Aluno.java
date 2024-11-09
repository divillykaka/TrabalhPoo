public class Aluno extends Pessoa{
    private final int matricula;

    public Aluno(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public void pagarMensalidade() { System.out.println("Mensalidade paga com sucesso!"); }
    public void exibirdados() {
      System.out.println("NOME:" + getNome() + "\nCPF:" + getCpf() + "\nIDADE:" + getIdade() + "\nMatrícula:" + matricula + "\n");
    }
}
