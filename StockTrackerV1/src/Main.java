public class Main {
    public static void main(String[] args){

        //create the stock tracker
        StockTracker tracker = new StockTracker();

        //Stocks to be tracked
        tracker.addStock(new Stock("AAPL", "Apple Inc.", 150.00, 50));
        tracker.addStock(new Stock("GOOGL", "Alphabet Inc.", 2800.00, 10));
        tracker.addStock(new Stock("TSLA", "Tesla Inc.", 700.00, 20));

        //Display all stocks
        System.out.println("Stocks in tracker:");
        tracker.displayStocks();
    }
}
