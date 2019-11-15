import java.util.LinkedList;

/**
 * Created by estebanparra on 11/14/19.
 */
public class Portfolio {

    private LinkedList<Stock> transactions;

    public Portfolio() {
        this.transactions = new LinkedList<Stock>();
    }

    /**
     * @param s
     * @return
     */
    public boolean addTransaction(Stock s){
        return transactions.add(s);
    }


    /**
     * @return
     */
    public double getTotalValue(){
        return 0.0;
    }





}
