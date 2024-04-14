import java.util.Random;

public class TrailSpace {
    
    String weather;
    String slope;

    public int calculateMovement(String pace) {
        int movement = 0;
        Random random = new Random();
        
        if (weather.equals("Cool") && slope.equals("Flat")) {
            if (pace.equals("Steady")) {
                movement = random.nextInt(2) + 1;
            } else if (pace.equals("Strenuous")) {
                movement = random.nextInt(3) + 1;
            } else if (pace.equals("Grueling")) {
                movement = random.nextInt(4) + 1;
            }
        } else if (weather.equals("Rainy") && slope.equals("Steep")) {
            if (pace.equals("Steady")) {
                movement = random.nextInt(2) + 1;
            } else if (pace.equals("Strenuous")) {
                movement = 1; 
            } else if (pace.equals("Grueling")) {
                movement = 1;
            }
        }
        return movement;
    }
}
