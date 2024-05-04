public class WagonLeader extends WagonMember {
    //regular points for banker
    //double points for caprenter
    //triple points for farmer
   
    String startOccupation;
    boolean doomed;

    public WagonLeader(String name, String startOccupation) {
        this.name = name;
        this.startOccupation = startOccupation;
        this.alive = true;
        this.disease = null;
        this.diseaseRisk = 0;
        this.health = 500;
        this.immunity = false;
        this.immunityDuration = 0;
        this.starving = false;
        this.doomed = false;
        // if(startOccupation.equals("Banker")) {
        //     this.points = points;
        // } else if(startOccupation.equals("Carpenter")) {
        //     this.points = points * 2;
        // } else if(startOccupation.equals("Farmer")) {
        //     this.points = points * 3;
        //}
    }
}