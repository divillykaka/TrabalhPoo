public class Regular extends Aluno{
    public Regular(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade, matricula);
    }
    
    public void pagarMensalidade() { System.out.println("Mensalidade paga com sucesso!"); }
}
