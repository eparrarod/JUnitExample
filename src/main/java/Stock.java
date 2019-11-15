/**
 * Created by estebanparra on 11/14/19.
 */
public class Stock {
    private Double basePrice;
    private String ticker;
    private Double bought;


    public Stock(Double basePrice, String ticker, Double bought) {
        this.basePrice = basePrice;
        this.ticker = ticker;
        this.bought = bought;
    }

    /**
     * @return
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * @return
     */
    public String getTicker() {
        return ticker;
    }

    /**
     * @param ticker
     */
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    /**
     * @return
     */
    public Double getBought() {
        return bought;
    }

    /**
     * @param bought
     */
    public void setBought(Double bought) {
        this.bought = bought;
    }

    /**
     * @return
     */
    public double getShares(){
        return 0.0;
        //TODO: implement
    }

}
