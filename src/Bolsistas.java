public class Bolsistas extends Aluno{
    public Bolsistas(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade, matricula);
    }

    public void pagarMensalidade() { System.out.println("Mensalidade paga com sucesso!"); }
}
