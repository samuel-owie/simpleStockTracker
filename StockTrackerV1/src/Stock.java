public class Stock {
    private String symbol;
    private String name;
    private double price;
    private int quantity;

    //Constructor
    public Stock(String symbol, String name, double price, int quantity){
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Getters and Setters
    public String getSymbol(){
        return symbol;
    }

    public String name(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Methods

    //Calculate stock's total value
    public double getValue(){
        return price * quantity;
    }

    //String representation
    @Override
    public String toString(){
        return name + " (" + symbol + ") - Price: $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Value: $" + String.format("%.2f", getValue());
    }
}
