// Mais um estratégia completa

public class PagamentoCartao implements EstrategiaPagamento {

    @Override
    public void processar(double valor){
        // Em cartao vamos ter um acréscimo de 3% devido às taxas da maquinha de cartão
        double valorFinal = valor * 1.03;
        System.out.println(" [CARTÃO] Conectando com sua operadora de cartão de crédito...");
        System.out.println(" [CARTÃO] Valor original: R$ " + valor + " | Valor com taxas: R$ " + valorFinal);
    }

}
