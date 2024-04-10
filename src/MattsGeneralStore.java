import java.util.HashMap;

public class MattsGeneralStore {
    private HashMap<String, Double> prices;
    private double totalCost;

    public MattsGeneralStore(){
        // update prices later
        prices.put("food", 0.20);
        prices.put("oxen", 40.0);
        prices.put("clothes", 10.0);
        prices.put("bullets", 2.0);
        prices.put("tongue", 10.0);
        prices.put("axle", 10.0);
        prices.put("wheel", 10.0);
    }
    
    public void sell(String key, int count, Wagon wagon, Item item){
        double cost;
        cost = prices.get(key) * count;
        wagon.updateMoney(cost);
        this.totalCost += cost;
        if(item instanceof Bullets){
            item.setCount(item.getCount()+count*20);
        } else{
            item.setCount(item.getCount()+count);
        }
    }



}
