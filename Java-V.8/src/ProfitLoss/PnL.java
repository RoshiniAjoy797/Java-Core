package ProfitLoss;

public class PnL {
	private final StockClient stockClient;

    public PnL(StockClient stockClient) {
        this.stockClient = stockClient;
    }

    public double calculatePnL(String ticker, double priceBought, double tradingFeeOfTransaction, double taxPercent) {
        if (priceBought < 0 || tradingFeeOfTransaction < 0 || taxPercent < 0) {
            throw new IllegalArgumentException("Price, trading fee, and tax percent must be non-negative.");
        }

        double earningsOrLossBeforeTax = getCurrentPriceOfStock(ticker) - priceBought - tradingFeeOfTransaction;
        return earningsOrLossBeforeTax > 0 ?
                earningsOrLossBeforeTax * (1 - taxPercent) :
                earningsOrLossBeforeTax;
    }

    private double getCurrentPriceOfStock(String ticker) {
        return stockClient.getCurrentPrice(ticker);
    }

}
