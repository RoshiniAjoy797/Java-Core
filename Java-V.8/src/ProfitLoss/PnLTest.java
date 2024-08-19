package ProfitLoss;

public class PnLTest {

	public static void main(String[] args) {
	        StockClient stockClient = new StockClient();
	        PnL pnl = new PnL(stockClient);

	        // Example 1: AAPL stock
	        String ticker1 = "AAPL";
	        double priceBought1 = 100.0;
	        double tradingFee1 = 0.5;
	        double taxPercent1 = 0.15;
	        double earnings1 = pnl.calculatePnL(ticker1, priceBought1, tradingFee1, taxPercent1);
	        System.out.println("PnL for " + ticker1 + ": " + earnings1);

	        // Example 2: GOOGL stock
	        String ticker2 = "GOOGL";
	        double priceBought2 = 2700.0;
	        double tradingFee2 = 1.0;
	        double taxPercent2 = 0.2;
	        double earnings2 = pnl.calculatePnL(ticker2, priceBought2, tradingFee2, taxPercent2);
	        System.out.println("PnL for " + ticker2 + ": " + earnings2);

	        // Example 3: MSFT stock
	        String ticker3 = "MSFT";
	        double priceBought3 = 290.0;
	        double tradingFee3 = 0.75;
	        double taxPercent3 = 0.1;
	        double earnings3 = pnl.calculatePnL(ticker3, priceBought3, tradingFee3, taxPercent3);
	        System.out.println("PnL for " + ticker3 + ": " + earnings3);
	    }
	}

