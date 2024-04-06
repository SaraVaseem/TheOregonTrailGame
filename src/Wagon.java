import java.util.ArrayList;

public class Wagon {
    private String pace;
    private int spacesPerDay;
    private String rations;
    private int livingMembers;
    private ArrayList<WagonMember> listOfMembers;
    private double moneyLeft;
    private boolean wagonFunctional;

    public Wagon(WagonMember member1, WagonMember member2, WagonMember member3, WagonMember member4, WagonMember member5){
        this.listOfMembers.add(member1);
        this.listOfMembers.add(member2);
        this.listOfMembers.add(member3);
        this.listOfMembers.add(member4);
        this.listOfMembers.add(member5);
        this.wagonFunctional = true;
        this.pace = "Steady";
    }

    public void setPace(String pace, ArrayList<WagonMember> listOFMembers){
        this.pace = pace;
        if(pace == "Steady"){
            spacesPerDay = 2;
            for(int i = 0; i < listOFMembers.size(); i++){
                listOFMembers.get(i).health += 2;
            }
        } else if (pace == "Strenuous"){
            spacesPerDay = 3;
            for(int i = 0; i < listOFMembers.size(); i++){
                listOFMembers.get(i).health -= 1;
            }
        } else if (pace == "Grueling"){
            spacesPerDay = 4;
            for(int i = 0; i < listOFMembers.size(); i++){
                listOFMembers.get(i).health -= 4;
            }
        }
    }

    public void move(int spaces){

    }
    
    public void breakWheel(){
        this.wagonFunctional = false;
    }

    public void breakAxle(){

    }

    public void breakTongue(){
        
    }

    public void oxDies(){

    }

    public void huntForFood(int c){

    }
}
