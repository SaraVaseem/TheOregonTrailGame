import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void test(){
        Oxen oxen = new Oxen();
        oxen.setCount(5);
        assertEquals(oxen.getCount(), 5);
    }

    WagonMember member1 = new WagonMember();
    WagonMember member2 = new WagonMember();
    WagonMember member3 = new WagonMember();
    WagonMember member4 = new WagonMember();
    WagonMember member5 = new WagonMember();
    Wagon wagon = new Wagon(member1, member2, member3, member4, member5, 1, 1600);
    MattsGeneralStore store = new MattsGeneralStore();

    @Test
    public void buyBullets(){
        Bullets bullets = new Bullets();
        store.sell("bullets", 10, wagon, bullets);
        assertEquals(bullets.getCount(), 200);
    }

    @Test
    public void checkMoneyAfterSelling(){
        ClothingSet clothes  = new ClothingSet();
        store.sell("clothes", 6, wagon, clothes);
        assertEquals(wagon.getMoney(), 1540, 0.001);
    }

    Food food = new Food();
    Oxen oxen = new Oxen();
    ClothingSet clothes = new ClothingSet();
    Bullets bullets = new Bullets();
    Tongue tongue = new Tongue(); 
    Axle axle = new Axle();
    Wheel wheel = new Wheel();
    Inventory inventory = new Inventory(food, oxen, clothes, bullets, tongue, axle, wheel);

    @Test
    public void addToInventory(){
        Food food2 = new Food();
        inventory.addItem(food2);
        ArrayList<Item> newList = new ArrayList<>();
        newList.add(food);
        newList.add(oxen);
        newList.add(clothes);
        newList.add(bullets);
        newList.add(tongue);
        newList.add(axle);
        newList.add(wheel);
        newList.add(food2);
        assertEquals(inventory.getList(), newList);
    }

    @Test
    public void removeFromInventory(){
        inventory.removeItem(clothes);
        inventory.removeItem(tongue);
        ArrayList<Item> newList = new ArrayList<>();
        newList.add(food);
        newList.add(oxen);
        newList.add(bullets);
        newList.add(axle);
        newList.add(wheel);
        assertEquals(inventory.getList(), newList);
    }
}
