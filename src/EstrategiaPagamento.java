public interface EstrategiaPagamento {

    // Aqui nossa strategy, cada forma de pagamento calculará sua taxa e e vai processar o valor
    void processar(double valor); // Apenas para facilitar, vamos trabalhar com double e não com a classe BigDecimal
    
} 