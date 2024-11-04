public class Professor extends Pessoa{
String centro;

public Professor(String nome, String cpf, int idade){
    super(nome, cpf, idade);
}

void aula() {
    System.out.println("Dar aula");
}

}
