public class RotacaoFactory {
    public static Rotacao getAceleracao(CarroType carroType) {
        if (carroType.equals(CarroType.PADRAO)) {
            return new Padrao();
        } else {
            return new Luxo();
        }
    }
}
