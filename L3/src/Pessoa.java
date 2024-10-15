public class Pessoa {
    public String nome = "Gabriel";
    public int idade = 28;   

    public static void main(String[] args){
        Pessoa gabriel = new Pessoa();
        System.out.println("A idade de " + gabriel.nome + "eh " + gabriel.idade + " anos");
    }
}
