public class AceleracaoExpressao implements Expressao{
    @Override
    public void interpretar(Carro carro) {
        carro.acelerar();
    }
}
