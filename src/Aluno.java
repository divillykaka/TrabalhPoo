public class Aluno extends Pessoa{
    //Da um tab para listar os atributos, o professor vai revisar o código também e não tem como saber se ele vai querer o código limpo ou não, então é melhor deixar ele mais bem formatado possível
    //Definir a privacidade do atributo também -> private int matricula;
int matricula;

    public Aluno(String nome, String cpf, int idade, int matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }
    
    //Adicionar método pagarMensalidade()
    //Como não pede um método para exibir dados é melhor não colocar
    public void exibirdados() {
        System.out.println("NOME:" + nome + "\nCPF:" + cpf + "\nIDADE:" + idade + "\nMatrícula:" + matricula + "\n");
    }
}
