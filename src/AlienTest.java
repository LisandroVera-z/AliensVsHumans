import org.junit.Test;
import static org.junit.Assert.*;

public class AlienTest {

    @Test
    public void testConstructor() {
        // Test constructor with valid parameters
        Alien alien = new Alien(100, 20, "Ray Gun", 15, "Healing Ray", 25, "Martian", 10);

        assertEquals(100, alien.getHealth());
        assertEquals(20, alien.attack);
        assertEquals("Ray Gun", alien.weapon);
        assertEquals(15, alien.weaponDMG);
        assertEquals("Healing Ray", alien.ability);
        assertEquals(25, alien.abilityDMG);
        assertEquals("Martian", alien.species);
        assertEquals(10, alien.heal);
    }

    @Test
    public void testUseHealOn() {
        Alien alien = new Alien(100, 20, "Ray Gun", 15, "Healing Ray", 25, "Martian", 10);
        Human human = new Human(80, 25, "Blaster", 20, "MedKit", 30, 15, 5);

        // Initial health of the human
        int initialHumanHealth = human.getHealth();

        // Alien uses heal on the human
        alien.useHealOn(alien, alien.heal, human);

        // Expected health after healing
        int expectedHumanHealth = initialHumanHealth + alien.heal;

        // Verify if the human's health is as expected after healing
        assertEquals(expectedHumanHealth, human.getHealth());
    }
}


