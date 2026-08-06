/*

Vamos implementar um padrão FACADE

*/

public class SistemaPagamentoFacade {

    // 1 - Atributos
    private EstrategiaPagamento pix;
    private EstrategiaPagamento cartao;

    // 2 - Construtor
    // Vamos faazer a fachada inicializar os subsistemas complexos internamente
    public SistemaPagamentoFacade() {
        this.pix = new PagamentoPix();
        this.cartao = new PagamentoCartao();
    }

    // Um pequeno menu exposto ao usuário
    public void efetuarPagamento(double valor, String tipo){
        System.out.println("\n --- Iniciando o Checkout Seguro ---");

        if (tipo.equalsIgnoreCase("PIX")){
            pix.processar(valor);

        } else if (tipo.equalsIgnoreCase("CARTÃO")){
            cartao.processar(valor);
        } else {
            System.out.println("Erro: Método de pagamento inválido!");
        }

        System.out.println("--- Checkout Finalizado com Sucesso ---");
    }

}
