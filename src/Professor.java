public class Professor extends Pessoa{
    //Privacidade do atributo
    String centro;

    public Professor(String nome, String cpf, int idade){
        super(nome, cpf, idade);
        //Inicializar o atributo centro
    }
    
    void darAula() {
        System.out.println("Dar aula");
    }
}
