// Noss primeira estratéfia completa 

public class PagamentoPix implements EstrategiaPagamento {

    @Override
    public void processar(double valor) {

        // Pix vai ter desconto de 5%
        double valorFinal = valor * 0.95;
        System.out.println(" [PIX]  Gerando QR Code...");
        System.out.println(" [PIX] Valor Original: R$ " + valor + " com desconto: R$ " + valorFinal);
    }

}
