public class WagonMember {
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

    public static void die() {
        if(health==0) {
            alive = false;
        }
        System.out.println(name + " has died.");
    }

    public static void updateHealth(String pace, String rations) {
        if(pace.equals("Steady")) {
            health += 2;
        } else if(pace.equals("Strenuous")) {
            health -= 1;
        } else if(pace.equals("Grueling")) {
            health -= 4;
        }

        if(rations.equals("Filling")) {
            health += 2;
        } else if(rations.equals("Meager")) {
            health -= 1;
        } else if(rations.equals("Bare Bones")) {
            health -= 2;
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