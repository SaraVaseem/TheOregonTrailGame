import java.util.Random;

public class RiverSpace extends LandmarkSpace {
   private int across;
   private double averageDepth;
   private double currentDepth;
   private double ferryPrice;
   Random rand = new Random();
   
   public RiverSpace(String name, int across, double averageDepth, double ferryPrice) {
      super(name);
      this.across = across;
      this.averageDepth = averageDepth;
      this.currentDepth = averageDepth;
      this.ferryPrice = ferryPrice;
      updateDepth();
   }
   
   public void updateDepth() {
      double change = rand.nextDouble() + .5;
      this.currentDepth = averageDepth * change;
      this.currentDepth -= currentDepth % .1; 
   }
   
   //Unsure of how to implement this rn but fording the river is quick but risky, and caulking the wagon is slower but safer
   
   public boolean fordTheRiver() {
      
   }
   
   public boolean caulkTheWagon() {
      
   }
   
   public void rideFerry(Wagon wagon) {
      wagon.updateMoney(ferryPrice);
   }
   
   public int getLength() {
      return this.across;
   }
   
   public double getDepth() {
      return this.currentDepth;
   }
   
   public double getFerryPrice() {
      return this.ferryPrice;
   }
}
