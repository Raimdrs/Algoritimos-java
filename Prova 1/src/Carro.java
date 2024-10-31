class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;

    // Métodos setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Métodos getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    // Método para retornar os detalhes do carro
    public String detalhes() {
        return "Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno();
    }
}