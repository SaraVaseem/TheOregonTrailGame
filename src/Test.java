import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class Test {

    //wagon member test scripts

    @Test
    public void testUpdateHealth() {
        WagonMember.updateHealth("Steady", "Filling");
        assertEquals(health, 2);
        WagonMember.updateHealth("Strenuous", "Meager");
        assertEquals(health, 1);
        WagonMember.updateHealth("Grueling", "Bare Bones");
        assertEquals(health, -1);
    }

    @Test
    public void testUpdateDisease() {
        diseaseRisk = 0.6;
        WagonMember.updateDisease();
        assertTrue(disease != null);
        diseaseRisk = 0.4;
        WagonMember.updateDisease();
        assertTrue(disease == null);
    }

    @Test
    public void testUpdateDiseaseRisk() {
        immunity = true;
        WagonMember.updateDiseaseRisk();
        assertEquals(diseaseRisk, 0);
        immunity = false;
        WagonMember.updateDiseaseRisk();
        assertEquals(diseaseRisk, 0.5);
    }

    @Test
    public void testUpdateImmunity() {
        disease = Disease.getRandomDisease();
        WagonMember.updateImmunity();
        assertTrue(immunity);
        disease = null;
        WagonMember.updateImmunity();
        assertFalse(immunity);
    }

    @Test
    public void testUpdateImmunityDuration() {
        immunity = true;
        WagonMember.updateImmunityDuration();
        assertEquals(immunityDuration, 5);
        immunity = false;
        WagonMember.updateImmunityDuration();
        assertEquals(immunityDuration, 0);
    }

    @Test
    public void testUpdateStarving() {
        rations = "Bare Bones";
        WagonMember.updateStarving();
        assertTrue(starving);
        rations = "Filling";
        WagonMember.updateStarving();
        assertFalse(starving);
    }

    @Test
    public void testDie() {
        health = 0;
        alive = true;
        WagonMember.die();
        assertFalse(alive);
    }
}
