import java.util.Random;
public class ClothingSet extends Item{
    private boolean isWearable = true;

    public void randomTear(){
        Random rand = new Random();
        int random = rand.nextInt(100);
        if(random == 1){
            this.isWearable = false;
            this.setCount(this.getCount()-1);
        }
    }

    public void affectMember(WagonMember member){
        if(!this.isWearable){
            if(this.getCount() == 0){
                member.diseaseRisk += 0.2;
            } else {
                this.setCount(this.getCount()-1);
                this.isWearable = true;
            }
        }
    }

    public void setIsWearable(boolean condition){
        this.isWearable = condition;
    }
}
