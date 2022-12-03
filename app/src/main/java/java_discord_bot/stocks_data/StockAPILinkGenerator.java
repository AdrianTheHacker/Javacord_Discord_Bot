package java_discord_bot.stocks_data;


public class StockAPILinkGenerator {
    // The following code is used easily get the link
    // needed for the stocks API.

    private String stockAPILink;
    private String stockAPIKey;
    private String stockSymbol;

    
    public StockAPILinkGenerator(String stockSymbol, String stockAPIKey) {
        // When an instance of this class is generated, 
        // a new link will be created.
        //
        // Once a link has been generated, it can't be changed.

        this.stockAPIKey = stockAPIKey;
        this.stockSymbol = stockSymbol;

        this.setStockAPILink(this.stockSymbol, this.stockAPIKey);
    }

    private void setStockAPILink(String stockSymbol, String stockAPIKey) {
        // This code formats the link so that the 
        // stock's symbol and the stock API's Private Key can be easily changed.

        this.stockAPILink = String.format("https://api.polygon.io/v2/aggs/ticker/%s", stockSymbol) + 
                            String.format("/range/1/day/2021-07-22/2021-07-22?adjusted=true&sort=desc&limit=120&apiKey=%s", stockAPIKey);
    }

    public String getStockAPILink() {
        return stockAPILink;
    }
}