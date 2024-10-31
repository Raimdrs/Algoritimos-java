public class Main {
    public static void main(String[] args) {
        // Instanciando três objetos da classe Carro
        Carro carro1 = new Carro();
        carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);

        Carro carro2 = new Carro();
        carro2.setMarca("Ford");
        carro2.setModelo("Fiesta");
        carro2.setAno(2018);

        Carro carro3 = new Carro();
        carro3.setMarca("Honda");
        carro3.setModelo("Civic");
        carro3.setAno(2022);

        // Imprimindo detalhes de cada carro
        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
