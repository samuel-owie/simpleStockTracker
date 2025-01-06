import java.util.ArrayList;

public class StockTracker {
    private ArrayList<Stock> stocks;

    //Constructors
    public StockTracker(){
        this.stocks = new ArrayList<>();
    }

    //Add a stock
    public void addStock(Stock stock){
        stocks.add(stock);
    }

    //Remove a stock by symbol
    public void removeStock(String symbol){
        stocks.removeIf(stock -> stock.getSymbol().equalsIgnoreCase(symbol));
    }

    //Update stock price by symbol
    public void updateStockPrice(String symbol, double newPrice){
        for(Stock stock : stocks){
            if(stock.getSymbol().equalsIgnoreCase(symbol)){
                stock.setPrice(newPrice);
                return;
            }
        }
    }
}
