public class Pessoa {
    int idade = 28;

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa gabriel = new Pessoa();

        System.out.println(gabriel.getIdade());
        gabriel.setIdade(gabriel.getIdade() + 1);
        System.out.println(gabriel.getIdade());
    }
}