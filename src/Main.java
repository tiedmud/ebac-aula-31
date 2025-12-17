//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n\n");

        Carro carro = CarroBuilder.create()
            .modelo("Civic")
            .cor("Branco")
            .ano(2025)
            .build();

        System.out.println(carro);

        float precoBase = 20000;

        System.out.println(PrecoStrategy.comprar(new Padrao(), precoBase));
        System.out.println(PrecoStrategy.comprar(new Luxo(), precoBase));

        Rotacao rotacao = RotacaoFactory.getAceleracao(CarroType.PADRAO);
        rotacao.acelerar();

        rotacao = RotacaoFactory.getAceleracao(CarroType.LUXO);
        rotacao.acelerar();
    }
}