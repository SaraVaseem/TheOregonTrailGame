import java.util.ArrayList;
import java.util.Random;

public class Wagon {
    private String pace;
    private int spacesPerDay;
    private String rations;
    private int livingMembers;
    private ArrayList<WagonMember> listOfMembers = new ArrayList<>();
    private double moneyLeft;
    private boolean wagonFunctional;
    private int points;
    private int pointMultiplier;

    public Wagon(WagonMember member1, WagonMember member2, WagonMember member3, WagonMember member4, WagonMember member5, int multiplier, int money){
        this.listOfMembers.add(member1);
        this.listOfMembers.add(member2);
        this.listOfMembers.add(member3);
        this.listOfMembers.add(member4);
        this.listOfMembers.add(member5);
        this.wagonFunctional = true;
        this.pace = "Steady";
        this.rations = "Filling";
        this.livingMembers = 5;
        this.pointMultiplier = multiplier;
        this.moneyLeft = money;
    }

    public void setPace(String pace){
        this.pace = pace;
        if(pace == "Steady"){
            this.spacesPerDay = 2;
            for(int i = 0; i < this.listOfMembers.size(); i++){
                this.listOfMembers.get(i).health += 2;
            }
        } else if (pace == "Strenuous"){
            this.spacesPerDay = 3;
            for(int i = 0; i < this.listOfMembers.size(); i++){
                this.listOfMembers.get(i).health -= 1;
            }
        } else if (pace == "Grueling"){
            this.spacesPerDay = 4;
            for(int i = 0; i < this.listOfMembers.size(); i++){
                this.listOfMembers.get(i).health -= 4;
            }
        }
    }

    public void setRations(String rations, Food food){
        this.rations = rations;
        if(rations == "Generous"){
            food.setCount(food.getCount()-3*livingMembers);
            for(int i = 0; i < this.listOfMembers.size(); i++){
                this.listOfMembers.get(i).health += 2;
            }
        } else if (rations == "Meager"){
            food.setCount(food.getCount()-2*livingMembers);
        } else if (rations == "Bare bones"){
            food.setCount(food.getCount()-livingMembers);
            for(int i = 0; i < this.listOfMembers.size(); i++){
                this.listOfMembers.get(i).health -= 3;
            }
        }
    }

    public int getSpacesPerDay(){
        return this.spacesPerDay;
    }

    public void move(int spaces, Trail trail){
        trail.spaces += spaces;
    }
    
    public void breakWheel(Wheel wheel){
        if(wheel.getCount() == 0){
            this.wagonFunctional = false;
        } else {
            wheel.setCount(wheel.getCount()-1);
        }
    }

    public void breakAxle(Axle axle){
        if(axle.getCount() == 0){
            this.wagonFunctional = false;
        } else {
            axle.setCount(axle.getCount()-1);
        }
    }

    public void breakTongue(Tongue tongue){
        if(tongue.getCount() == 0){
            this.wagonFunctional = false;
        } else {
            tongue.setCount(tongue.getCount()-1);
        }
    }

    public void oxDies(Oxen ox){
        if(ox.getCount() == 0){
            this.wagonFunctional = false;
        } else {
            ox.setCount(ox.getCount()-1);
        }
    }

    public void memberDies(WagonMember member){
        this.livingMembers--;
        this.listOfMembers.remove(member);
    }

    public void updateMoney(double amount){
        this.moneyLeft -= amount;
    }

    public double getMoney(){
        return this.moneyLeft;
    }

    public void huntForFood(Bullets bullets, Food food){
        Random rand = new Random();
        int random = rand.nextInt(5);
        if(random == 1){ // 1/5 chance of shooting something
            random = rand.nextInt(10); // different probabilities of type of animal hunted
            if(random == 0 || random == 1 || random == 2){
                System.out.println("You shot a rabbit. +4 lbs of food.");
                food.setCount(food.getCount()+4);
            } else if(random == 3 || random == 4 || random == 5){
                System.out.println("You shot a squirrel. +4 lbs of food.");
                food.setCount(food.getCount()+4);
            } else if(random == 6 || random == 7){
                System.out.println("You shot a deer. +50 lbs of food.");
                food.setCount(food.getCount()+50);
            } else if(random == 8){
                System.out.println("You shot a buffalo. +75 lbs of food.");
                food.setCount(food.getCount()+75);
            } else {
                System.out.println("You shot a bear. +100 lbs of food.");
                food.setCount(food.getCount()+100);
            }
        } else {
            System.out.println("Hunt was not successful. You did not shoot anything.");
        }
        bullets.shoot();
    }

    public int calculatePoints(){
        return points * pointMultiplier;
    }
}


