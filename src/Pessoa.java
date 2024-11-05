public class Pessoa {
    //Colocar a privacidade dos atributos
    String nome;
    String cpf;
    int idade;

    public Pessoa(String nome, String cpf, int idade){
       this.nome = nome;
       this.cpf = cpf;
       this.idade = idade;
    }

    //Criar os getters e setters para cada atributo
    
    //Como não pede um método para exibir dados é melhor não colocar
    public void exibirdados() {
        System.out.println("NOME:" + nome + "\nCPF:" + cpf + "\nIDADE:" + idade + "\n");
    }

    //Modificar usando o setter
    //O método fazerAniversario() é para ser público
    void fazerAniversario() {
        int niver = idade + 1;
        System.out.println("Parabéns pelos seus " + niver + " anos" );
    }

    //O método de pagar mensalidade fica na classe Aluno, então melhor remover
    void mensalidade(){
        System.out.println("Pagar a Mensalidade");
    }

}



