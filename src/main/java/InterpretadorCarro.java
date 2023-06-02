public class InterpretadorCarro {

    public void interpretar(String expressao, Carro carro) {
        Expressao expressao1;
        switch (expressao.toLowerCase()) {
            case "ligar":
                expressao1 = new LigacaoExpressao();
                break;
            case "acelerar":
                expressao1 = new AceleracaoExpressao();
                break;
            case "frear":
                expressao1 = new FreioExpressao();
                break;
            default:
                System.out.println("Expressão inválida");
                return;
        }
        expressao1.interpretar(carro);
    }
}
