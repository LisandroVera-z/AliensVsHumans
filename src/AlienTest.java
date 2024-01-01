import org.junit.Test;
import static org.junit.Assert.*;

public class AlienTest {

    @Test
    public void testAlienConstructor() {
        Alien alien = new Alien(120, 25, "Ray Gun", 15, "Healing Wave", 10, "Xenon", 30);

        assertEquals(120, alien.getHealth());
        assertEquals(25, alien.attack);
        assertEquals("Ray Gun", alien.weapon);
        assertEquals(15, alien.weaponDMG);
        assertEquals("Healing Wave", alien.ability);
        assertEquals(10, alien.abilityDMG);
        assertEquals("Xenon", alien.species);
        assertEquals(30, alien.heal);
    }

    @Test
    public void testUseHealOn() {
        Alien alien = new Alien(120, 25, "Ray Gun", 15, "Healing Wave", 10, "Xenon", 30);
        Entity target = new Entity(80, 18, "Sword", 12, "Fireball", 20);

        alien.useHealOn(30, target);

        assertEquals(110, target.getHealth());
    }
}

