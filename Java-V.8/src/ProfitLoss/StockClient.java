package ProfitLoss;

public class StockClient {
	public double getCurrentPrice(String ticker) {
        // Mock implementation for example purposes.
        switch (ticker) {
            case "AAPL":
                return 150.0;
            case "GOOGL":
                return 2800.0;
            case "MSFT":
                return 300.0;
            default:
                throw new IllegalArgumentException("Unknown ticker: " + ticker);
        }
    }
}
