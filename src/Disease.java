import java.util.Random;

public class Disease extends WagonMember {
    String name;
    int severity;
    int duration;

    //disease names array
    public static String[] diseaseNames = {"Dysentery", "Typhoid", "Cholera", "Measles", "Malaria", "Smallpox", "Yellow Fever", "Influenza", "Pneumonia", "Tuberculosis", "Scarlet Fever", "Mumps", "Chicken Pox", "Whooping Cough", "Diphtheria", "Polio", "Hepatitis", "Meningitis", "Rabies", "Ebola", "Zika", "HIV", "COVID-19"};

    public Disease(String name, int severity, int duration) {
        this.name = name;
        this.severity = severity;
        this.duration = duration;
    }

    public static Disease getRandomDisease() {
        // return a random disease
        Random rand = new Random();
        return new Disease(diseaseNames[rand.nextInt(diseaseNames.length)], rand.nextInt(10), rand.nextInt(10));
    }

    public static boolean isContagious() {
        // return true if the disease is contagious
        return this.severity > 5;
    }

    public static String getName() {
        return this.name;
    }

    public static int getSeverity() {
        return this.severity;
    }

    public static void updateDuration() {
        this.duration--;
        if(this.duration == 0) {
            this.disease = null;
        }
    }
}
