public class Pessoa {
    int idade = 28;

    public void fazerAniversario(){
        this.idade++;
    }

    public static void main(String[] args) {
        Pessoa gabriel = new Pessoa();
        
        System.out.println(gabriel.idade);
        gabriel.fazerAniversario();
        System.out.println(gabriel.idade);
    }
}