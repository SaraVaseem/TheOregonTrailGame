import java.util.ArrayList;

public class Inventory {
    //Resources of party:   wagon = 50 points
    //                      ox = 4 points
    //                      spare wagon part = 2 points
    //                      set of clothing = 2 points
    //                      bullets (each 50) = 1 point
    //                      food (each 25 pounds) = 1 point
    //                      cash (each 5 dollars) = 1 point
    private ArrayList<Item> completeInventory = new ArrayList<>();

    public Inventory(Food food, Oxen oxen, ClothingSet clothes, Bullets bullets, Tongue tongue, Axle axle, Wheel wheel){
        addItem(food);
        addItem(oxen);
        addItem(clothes);
        addItem(bullets);
        addItem(tongue);
        addItem(axle);
        addItem(wheel);
    }

    public void addItem(Item item){
        this.completeInventory.add(item);
    }

    public void removeItem(Item item){
        this.completeInventory.remove(item);
    }
}
