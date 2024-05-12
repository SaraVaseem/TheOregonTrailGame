import java.util.HashMap;

public class NewInventory {
    private int oxenCount;
    private int foodCount;
    private int clothingCount;
    private int ammunitionCount;
    private int axlesCount;
    private int tonguesCount;
    private int wheelsCount;
    private HashMap<Item, Integer> completeInventory;
    private HashMap<Item, Double> merchantInventory;
    private Oxen oxen;
    private Food food;
    private ClothingSet clothing;
    private Bullets ammunition;
    private Axle axles;
    private Tongue tongues;
    private Wheel wheels;

    public NewInventory() {
        this.completeInventory = new HashMap<Item, Integer>();
        this.oxenCount = 0;
        this.foodCount = 0;
        this.clothingCount = 0;
        this.ammunitionCount = 0;
        this.axlesCount = 0;
        this.tonguesCount = 0;
        this.wheelsCount = 0;
        itemConstructor();
        inventoryConstructor();
    }

    public NewInventory(int oxen, int food, int clothing, int ammunition, int axles, int tongues, int wheels) {
        this.completeInventory = new HashMap<Item, Integer>();
        this.oxenCount = oxen;
        this.foodCount = food;
        this.clothingCount = clothing;
        this.ammunitionCount = ammunition;
        this.axlesCount = axles;
        this.tonguesCount = tongues;
        this.wheelsCount = wheels;
        itemConstructor();
        inventoryConstructor();
    }

    public NewInventory(double oxen, double food, double clothing, double ammunition, double axles, double tongues, double wheels) {
        this.merchantInventory = new HashMap<Item, Double>();
        itemConstructor();
        merchantInventory.put(this.oxen, oxen);
        merchantInventory.put(this.food, food);
        merchantInventory.put(this.clothing, clothing);
        merchantInventory.put(this.ammunition, ammunition);
        merchantInventory.put(this.axles, axles);
        merchantInventory.put(this.tongues, tongues);
        merchantInventory.put(this.wheels, wheels);
    }

    private void itemConstructor() {
        this.completeInventory = new HashMap<Item, Integer>();
        this.oxen = new Oxen();
        this.food = new Food();
        this.clothing = new ClothingSet();
        this.ammunition = new Bullets();
        this.axles = new Axle();
        this.tongues = new Tongue();
        this.wheels = new Wheel();
    }

    private void inventoryConstructor() {
        completeInventory.put(oxen, oxenCount);
        completeInventory.put(food, foodCount);
        completeInventory.put(clothing, clothingCount);
        completeInventory.put(ammunition, ammunitionCount);
        completeInventory.put(axles, axlesCount);
        completeInventory.put(tongues, tonguesCount);
        completeInventory.put(wheels, wheelsCount);
    }

    public boolean use(Item item, int count) {
        if(completeInventory.get(item) > count) {
            completeInventory.replace(item, completeInventory.get(item) - count);
            return true;
        } else {
            return false;
        }
    }

    public void add(Item item, int count) {
        completeInventory.replace(item, completeInventory.get(item) + count);
    }

    public int getCount(Item item) {
        return completeInventory.get(item);
    }
}