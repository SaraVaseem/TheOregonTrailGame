import java.util.HashMap;
import java.util.Scanner;

public class MattsGeneralStore {
    private newInventory prices;
    private Scanner sc;

    public MattsGeneralStore(){
        // update prices later
        prices = new newInventory(20, .2, 10, .1, 10, 10, 10);

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

    public double getTotalCost(){
        return this.totalCost;
    }

}
