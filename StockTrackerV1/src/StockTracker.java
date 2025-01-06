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
}
