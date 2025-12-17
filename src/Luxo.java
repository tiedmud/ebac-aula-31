public class Luxo implements CalculoPreco, Rotacao {
    @Override
    public float calcular(float preco) {
        return  preco = preco * 3;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro de luxo acelerando...");
    }
}