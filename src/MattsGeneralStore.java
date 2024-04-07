import java.util.HashMap;

public class MattsGeneralStore {
    private HashMap<String, Double> prices;

    public MattsGeneralStore(){
        // update prices later
        prices.put("food", 1.0);
        prices.put("oxen", 1.0);
        prices.put("clothes", 1.0);
        prices.put("bullets", 1.0);
        prices.put("tongue", 1.0);
        prices.put("axle", 1.0);
        prices.put("wheel", 1.0);
    }
    
    public void sell(String item, int count, Wagon wagon){
        double cost;
        cost = prices.get(item) * count;
        wagon.updateMoney(cost);
    }
}
