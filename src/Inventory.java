import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> completeInventory = new ArrayList<>();

    public void addItem(Item item){
        completeInventory.add(item);
    }

    public void removeItem(Item item){
        completeInventory.remove(item);
    }
}
