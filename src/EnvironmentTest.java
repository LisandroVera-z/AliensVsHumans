import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class EnvironmentTest {

    private Environment environment;
    private Human human;
    private Alien alien;
    private Alien alienTwo;

    @Before
    public void setUp() {
        environment = new Environment(3, 3);
        human = new Human(100, 20, "Gun", 15, "Suplex", 25, 10, 5);
        alien = new Alien(120, 25, "Ray Gun", 20, "Laser Ray", 30, "Martian", 15);
        alienTwo = new Alien(120, 25, "Ray Gun", 20, "Laser Ray", 30, "Martian", 15);
    }

    @After
    public void tearDown() {
        // Clean up after each test if needed
    }

    @Test
    public void testAddEntityToCell() {
        environment.addEntityToCell(human, 0, 0);

        // Retrieve entities in the cell
        List<Entity> entities = environment.getEntitiesInCell(0, 0);

        // Check if the entity was added to the cell
        assertTrue(entities.contains(human));
    }

    @Test
    public void testHumanUseAttackOn() {
        environment.addEntityToCell(human, 0, 0);
        environment.addEntityToCell(alien, 0, 1);

        // Human attacks Alien
        environment.humanUseAttackOn(human, 20, 0, 1);

        // Check if Alien's health is reduced
        assertEquals(120 - 19, alien.getHealth());
    }

    @Test
    public void testAlienUseAttackOn() {
        environment.addEntityToCell(alien, 1, 1);
        environment.addEntityToCell(human, 1, 2);

        // Alien attacks Human
        environment.alienUseAttackOn(alien, 25, 1, 2);

        // Check if Human's health is reduced
        assertEquals(100 - 24, human.getHealth());
    }

    @Test
    public void testAlienUseHealOn() {
        environment.addEntityToCell(alien, 1, 1);
        environment.addEntityToCell(alienTwo, 1, 2);

        // Alien heals Human
        environment.alienUseHealOn(alien, 15, 1, 2);

        // Check if AlienTwo's health is increased
        assertEquals(120 + 14, alienTwo.getHealth());
    }

    @Test
    public void testHumanUseWeaponOn() {
        environment.addEntityToCell(human, 0, 0);
        environment.addEntityToCell(alien, 0, 1);

        // Human uses weapon on Alien
        environment.humanUseWeaponOn(human, "Gun", 15, 0, 1);

        // Check if Alien's health is reduced
        assertEquals(120 - 14, alien.getHealth());
    }

    @Test
    public void testAlienUseWeaponOn() {
        environment.addEntityToCell(alien, 1, 1);
        environment.addEntityToCell(human, 1, 2);

        // Alien uses weapon on Human
        environment.alienUseWeaponOn(alien, "Ray Gun", 20, 1, 2);

        // Check if Human's health is reduced
        assertEquals(100 - 19, human.getHealth());
    }

    @Test
    public void testHumanUseAbilityOn() {
        environment.addEntityToCell(human, 0, 0);
        environment.addEntityToCell(alien, 0, 1);

        // Human uses ability on Alien
        environment.humanUseAbilityOn(human, "Suplex", 25, 0, 1);

        // Check if Alien's health is reduced
        assertEquals(120 - 24, alien.getHealth());
    }

    @Test
    public void testAlienUseAbilityOn() {
        environment.addEntityToCell(alien, 1, 1);
        environment.addEntityToCell(human, 1, 2);

        // Alien uses ability on Human
        environment.alienUseAbilityOn(alien, "Laser Ray", 30, 1, 2);

        // Check if Human's health is reduced
        assertEquals(100 - 29, human.getHealth());
    }
    @Test
    public void testCalculateDistance() {
        // Create two entities at different positions
        Entity entity1 = new Human(100, 20, "Gun", 15, "Suplex", 25, 10, 5);
        Entity entity2 = new Alien(120, 25, "Ray Gun", 20, "Laser Ray", 30, "Martian", 15);

        // Set positions for entities
        entity1.setRow(0);
        entity1.setCol(0);
        entity2.setRow(1);
        entity2.setCol(1);

        // Calculate distance
        int distance = environment.calculateDistance(entity1, entity2);

        // Manually calculate expected distance (Euclidean distance)
        int expectedDistance = (int) Math.sqrt(Math.pow(1 - 0, 2) + Math.pow(1 - 0, 2));

        // Check if the calculated distance matches the expected distance
        assertEquals(expectedDistance, distance);
    }

    @Test
    public void testAdjustDamageBasedOnDistance() {
        // Assume original damage and distance values
        int originalDamage = 20;
        int distance = 2;

        // Call the method to adjust damage based on distance
        int adjustedDamage = environment.adjustDamageBasedOnDistance(originalDamage, distance);

        // Manually calculate expected adjusted damage
        int expectedAdjustedDamage = Math.max(originalDamage - distance, 0);

        // Check if the calculated adjusted damage matches the expected adjusted damage
        assertEquals(expectedAdjustedDamage, adjustedDamage);
    }

}