public class Padrao implements CalculoPreco, Rotacao {
    @Override
    public float calcular(float preco) {
        return preco;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro padrão acelerando...");
    }
}
