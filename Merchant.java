import java.util.HashMap;
import java.util.Random;

public class Merchant {
   private HashMap<Item, Double> availableItems = new HashMap<>();
   Random rand = new Random();
   
   public Merchant() {
      //Traders will have a random set of items available for purchase (always at least 1 thing)
      maybeInSet(Food);
      maybeInSet(Oxen);
      maybeInSet(Clothes);
      maybeInSet(Bullets);
      maybeInSet(Tongue);
      maybeInSet(Axle);
      maybeInSet(Wheel);
      
      if (availableItems.isEmpty()) {
         int singleItem = rand.nextInt(7) + 1;
         
         switch(singleItem) {
            case 1 :
               availableItems.put(Food, randomlyDeterminePrice(Food));
            case 2 :
               availableItems.put(Oxen, randomlyDeterminePrice(Oxen));
            case 3 :
               availableItems.put(Clothes, randomlyDeterminePrice(Clothes));
            case 4 :
               availableItems.put(Bullets, randomlyDeterminePrice(Bullets));
            case 5 :
               availableItems.put(Tongue, randomlyDeterminePrice(Tongue));
            case 6 :
               availableItems.put(Axle, randomlyDeterminePrice(Axle));
            case 7 :
               availableItems.put(Wheel, randomlyDeterminePrice(Wheel));
         }
      }
   }
   
   private void maybeInSet(Item item) {
      double chance = rand.nextDouble();
      if(chance < .25) {
         availableItems.put(item, randomlyDeterminePrice(item));
      }
   }
   
   private double randomlyDeterminePrice(Item item) {
      //Item prices can be up to 50% more than those found at Matt's General Store (prices could change later)
      double additionalCost = (rand.nextDouble() * item.getPrice() * .5);
      additionalCost -= additionalCost % .01;
      return item.getPrice() + additionalCost;
   }
   
   public void sell(Item item, int count, Inventory inventory, Wagon wagon) {
      inventory.add(item, count);
      wagon.updateMoney(availableItems.get(item) * count);
   }
}