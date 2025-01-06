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
        System.out.println("Stock with symbol " + symbol + " not found.");
    }

    //Display all stocks
    public void displayStocks(){
        if(stocks.isEmpty()){
            System.out.println("No stocks in the tracker.");
        } else {
            for(Stock stock : stocks){
                System.out.println(stock.toString()); //Explicit toString call, although it is implicitly called with a simple println(stock) call
            }
        }
    }
}
