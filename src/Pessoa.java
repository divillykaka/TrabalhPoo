public class Pessoa {
    String nome;
    String cpf;
    int idade;

public Pessoa(String nome, String cpf, int idade){
   this.nome = nome;
   this.cpf = cpf;
   this.idade = idade;
}
   public void exibirdados() {
        System.out.println("NOME:" + nome + "\nCPF:" + cpf + "\nIDADE:" + idade + "\n");
    }
    void fazerAniversario() {
        int niver = idade + 1;
        System.out.println("Parabéns pelos seus " + niver + " anos" );
    }
    void mensalidade(){
        System.out.println("Pagar a Mensalidade");
    }

}



