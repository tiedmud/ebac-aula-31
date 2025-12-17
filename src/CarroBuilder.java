public class CarroBuilder {
    private String modelo;
    private int ano;
    private String cor;

    public static CarroBuilder create() {
        return new CarroBuilder();
    }

    public CarroBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder ano(int ano) {
        this.ano = ano;
        return this;
    }

    public CarroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public Carro build() {
        return new Carro(modelo, ano, cor);
    }
}
