import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Tests {

    //wagon member test scripts

    @Test
    public void testUpdateHealth() {
        member1.updateHealth("Steady", "Filling");
        assertEquals(member1.health, 2);
        assertEquals(wagon.spacesPerDay, 2);
        member1.updateHealth("Strenuous", "Meager");
        assertEquals(member1.health, 1);
        assertEquals(wagon.spacesPerDay, 3);
        member1.updateHealth("Grueling", "Bare Bones");
        assertEquals(member1.health, -1);
        assertEquals(wagon.spacesPerDay, 4);
    }

    @Test
    public void testUpdateDisease() {
        member1.diseaseRisk = 0.6;
        member1.updateDisease();
        assertTrue(member1.disease != null);
        member1.diseaseRisk = 0.4;
        member1.updateDisease();
        assertTrue(member1.disease == null);
    }

    @Test
    public void testUpdateDiseaseRisk() {
        member2.immunity = true;
        member2.updateDiseaseRisk();
        assertEquals(member2.diseaseRisk, 0, 0.1);
        member2.immunity = false;
        member2.updateDiseaseRisk();
        assertEquals(member2.diseaseRisk, 0.5, 0.1);
    }

    @Test
    public void testUpdateImmunity() {
        member3.disease = disease.getRandomDisease();
        member3.updateImmunity();
        assertTrue(member3.immunity);
        member3.disease = null;
        member3.updateImmunity();
        assertFalse(member3.immunity);
    }

    @Test
    public void testUpdateImmunityDuration() {
        member4.immunity = true;
        member4.updateImmunityDuration();
        assertEquals(member4.immunityDuration, 5);
        member4.immunity = false;
        member4.updateImmunityDuration();
        assertEquals(member4.immunityDuration, 0);
    }

    @Test
    public void testUpdateStarving() {
        member5.rations = "Bare Bones";
        member5.updateStarving();
        assertTrue(member5.starving);
        member5.rations = "Filling";
        member5.updateStarving();
        assertFalse(member5.starving);
    }

    @Test
    public void testDie() {
        member1.health = 0;
        member1.alive = true;
        member1.die();
        assertFalse(member1.alive);
    }

    @Test
    public void testItemCount(){
        Oxen oxen = new Oxen();
        oxen.setCount(5);
        assertEquals(5, oxen.getCount());
    }

    Disease disease = new Disease("Dysentery", 5, 5);
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
        assertEquals(200, bullets.getCount());
    }

    @Test
    public void checkMoneyAfterSelling(){
        ClothingSet clothes  = new ClothingSet();
        store.sell("clothes", 6, wagon, clothes);
        assertEquals(1540, wagon.getMoneyLeft(), 0.001);
    }

    @Test
    public void settingPace(){
        wagon.setPace("Strenuous");
        assertEquals(3, wagon.getSpacesPerDay());
    }

    @Test
    public void settingRations(){
        food.setCount(50);
        wagon.setRations("Bare bones", food);
        assertEquals(45, food.getCount());
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
        assertEquals(newList, inventory.getList());
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
        assertEquals(newList, inventory.getList());
    }

    @Test
    public void testHuntingBullets(){
        bullets.setCount(100);
        wagon.huntForFood(bullets, food);
        wagon.huntForFood(bullets, food);
        wagon.huntForFood(bullets, food);
        wagon.huntForFood(bullets, food);
        wagon.huntForFood(bullets, food);
        assertEquals(95, bullets.getCount());
    }

    @Test
    public void testClothingUnwearable(){
        clothes.setCount(10);
        clothes.setIsWearable(false);
        clothes.affectMember(member1);
        assertEquals(9, clothes.getCount());
    }
}
