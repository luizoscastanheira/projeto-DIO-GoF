public class App {
    public static void main(String[] args) throws Exception {

        // Nosso cliente interagem APENAS com uma fachada simples
        SistemaPagamentoFacade caixaContruido = new SistemaPagamentoFacade();

        double valorCompra = 100.00;

        // Cenário 1: Um pagamento via PIX é efetuado
        caixaContruido.efetuarPagamento(valorCompra, "PIX");

        // Cenário 2: Um pagamento via CARTÃO é efetuado
        caixaContruido.efetuarPagamento(valorCompra, "CARTÃO");
    }
}
