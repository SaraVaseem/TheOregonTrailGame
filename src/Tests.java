import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Tests {

    //wagon member test scripts

    @Test
    public void testUpdateHealth() {
        WagonMember.updateHealth("Steady", "Filling");
        assertEquals(health, 2);
        assertEquals(spacesPerDay, 2);
        WagonMember.updateHealth("Strenuous", "Meager");
        assertEquals(health, 1);
        assertEquals(spacesPerDay, 3);
        WagonMember.updateHealth("Grueling", "Bare Bones");
        assertEquals(health, -1);
        assertEquals(spacesPerDay, 4);
    }

    @Test
    public void testUpdateDisease() {
        diseaseRisk = 0.6;
        WagonMember.updateDisease();
        assertTrue(disease != null);
        diseaseRisk = 0.4;
        WagonMember.updateDisease();
        assertTrue(disease == null);
    }

    @Test
    public void testUpdateDiseaseRisk() {
        immunity = true;
        WagonMember.updateDiseaseRisk();
        assertEquals(diseaseRisk, 0);
        immunity = false;
        WagonMember.updateDiseaseRisk();
        assertEquals(diseaseRisk, 0.5);
    }

    @Test
    public void testUpdateImmunity() {
        disease = Disease.getRandomDisease();
        WagonMember.updateImmunity();
        assertTrue(immunity);
        disease = null;
        WagonMember.updateImmunity();
        assertFalse(immunity);
    }

    @Test
    public void testUpdateImmunityDuration() {
        immunity = true;
        WagonMember.updateImmunityDuration();
        assertEquals(immunityDuration, 5);
        immunity = false;
        WagonMember.updateImmunityDuration();
        assertEquals(immunityDuration, 0);
    }

    @Test
    public void testUpdateStarving() {
        rations = "Bare Bones";
        WagonMember.updateStarving();
        assertTrue(starving);
        rations = "Filling";
        WagonMember.updateStarving();
        assertFalse(starving);
    }

    @Test
    public void testDie() {
        health = 0;
        alive = true;
        WagonMember.die();
        assertFalse(alive);
    }

    @Test
    public void testItemCount(){
        Oxen oxen = new Oxen();
        oxen.setCount(5);
        assertEquals(5, oxen.getCount());
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
        assertEquals(200, bullets.getCount());
    }

    @Test
    public void checkMoneyAfterSelling(){
        ClothingSet clothes  = new ClothingSet();
        store.sell("clothes", 6, wagon, clothes);
        assertEquals(1540, wagon.getMoney(), 0.001);
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
