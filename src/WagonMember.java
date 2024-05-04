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
        if(health==0) {
            alive = false;
        }
        System.out.println(name + " has died.");
    }

    public static void updateHealth(String pace, String rations) {
        if(pace.equals("Steady")) {
            health += 2;
            spacesPerDay += 2;
        } else if(pace.equals("Strenuous")) {
            health -= 1;
            spacesPerDay += 3;
        } else if(pace.equals("Grueling")) {
            health -= 4;
            spacesPerDay += 4;
        }

        if(rations.equals("Filling")) {
            rations -= 3;
            health += 2;
        } else if(rations.equals("Meager")) {
            rations -= 2;
        } else if(rations.equals("Bare Bones")) {
            rations -= 1;
            health -= 3;
        }
    }

    public static void updateDisease() {
        if(diseaseRisk > 0.5) {
            disease = Disease.getRandomDisease();
        }
    }

    public static void updateDiseaseRisk() {
        if(immunity) {
            diseaseRisk = 0;
        } else {
            diseaseRisk = 0.5;
        }
    }

    public static void updateImmunity() {
        if(disease != null) {
            immunity = disease.isContagious();
        }
    }

    public static void updateImmunityDuration() {
        if(immunity) {
            immunityDuration = 5;
        } else {
            immunityDuration = 0;
        }
    }

    public static void updateStarving() {
        if(rations.equals("Bare Bones")) {
            starving = true;
        } else {
            starving = false;
        }
    }    
}