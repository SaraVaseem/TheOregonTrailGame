public class WagonLeader extends WagonMember {
    //regular points for banker
    //double points for caprenter
    //triple points for farmer
   
    String startOccupation;
    boolean doomed;

    public WagonLeader(String name, String startOccupation) {
        super(name);
        this.startOccupation = startOccupation;
        this.doomed = false;
    }
}