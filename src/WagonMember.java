public class WagonMember extends Wagon {
    //Health of party: good = 500 points
    //                 fair = 400 points
    //                 poor = 300 points
    //                 very poor = 200 points

    String name;
    boolean alive;
    Disease disease;
    double diseaseRisk;
    int health;
    boolean immunity;
    int immunityDuration;
    boolean starving;

    public WagonMember(){}
    public WagonMember(String name) {
        this.name = name;
        this.alive = true;
        this.disease = null;
        this.diseaseRisk = 0;
        this.health = 500;
        this.immunity = false;
        this.immunityDuration = 0;
        this.starving = false;
    }

    public static void die() {
        if(this.health==0) {
            this.alive = false;
        }
        System.out.println(this.name + " has died.");
    }

    public static void updateHealth(String pace, String rations) {
        if(pace.equals("Steady")) {
            this.health += 2;
            this.spacesPerDay += 2;
        } else if(pace.equals("Strenuous")) {
            this.health -= 1;
            this.spacesPerDay += 3;
        } else if(pace.equals("Grueling")) {
            this.health -= 4;
            this.spacesPerDay += 4;
        }

        if(rations.equals("Filling")) {
            //rations -= 3;
            this.health += 2;
        } else if(rations.equals("Meager")) {
            //rations -= 2;
        } else if(rations.equals("Bare Bones")) {
            //rations -= 1;
            this.health -= 3;
        }
    }

    public static void updateDisease() {
        if(this.diseaseRisk > 0.5) {
            this.disease = Disease.getRandomDisease();
        }
    }

    public static void updateDiseaseRisk() {
        if(this.immunity) {
            this.diseaseRisk = 0;
        } else {
            this.diseaseRisk = 0.5;
        }
    }

    public static void updateImmunity() {
        if(this.disease != null) {
            this.immunity = disease.isContagious();
        }
    }

    public static void updateImmunityDuration() {
        if(this.immunity) {
            this.immunityDuration = 5;
        } else {
            this.immunityDuration = 0;
        }
    }

    public static void updateStarving() {
        if(rations.equals("Bare Bones")) {
            this.starving = true;
        } else {
            this.starving = false;
        }
    }    
}