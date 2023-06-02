public class LigacaoExpressao implements Expressao{
    @Override
    public void interpretar(Carro carro) {
        carro.ligar();
    }
}
