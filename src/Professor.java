public class Professor extends Pessoa{
    private final String centro;

    public Professor(String nome, String cpf, int idade, String centro){
        super(nome, cpf, idade);
        this.centro = centro;
    }
    
    public void darAula() {
        System.out.println("O professor " + super.getNome() + "vai esta dando aula");
    }
}
