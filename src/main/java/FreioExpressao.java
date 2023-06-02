public class FreioExpressao implements Expressao{
    @Override
    public void interpretar(Carro carro) {
        carro.frear();
    }
}
