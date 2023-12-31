import org.junit.Test;
import static org.junit.Assert.*;

public class AlienTest {

    @Test
    public void testAlienConstructor() {
        String testName = "TestAlien";
        int testHealth = 120;
        int testAttack = 25;
        String testWeapon = "Ray Gun";
        int testWeaponDMG = 20;
        String testAbility = "Teleport";
        int testAbilityDMG = 35;
        String testSpecies = "Martian";
        int testHeal = 15;

        Alien alien = new Alien(testName, testHealth, testAttack, testWeapon, testWeaponDMG, testAbility, testAbilityDMG, testSpecies, testHeal);

        // Test that the fields are set correctly
        assertEquals(testName, alien.name);
        assertEquals(testHealth, alien.health);
        assertEquals(testAttack, alien.attack);
        assertEquals(testWeapon, alien.weapon);
        assertEquals(testWeaponDMG, alien.weaponDMG);
        assertEquals(testAbility, alien.ability);
        assertEquals(testAbilityDMG, alien.abilityDMG);
        assertEquals(testSpecies, alien.species);
        assertEquals(testHeal, alien.heal);
    }

    @Test
    public void testUseHealOn() {
        Alien alien = new Alien("TestAlien", 120, 25, "Ray Gun", 20, "Teleport", 35, "Martian", 15);
        Entity target = new Entity("Target", 80, 20, "Axe", 10, "Shield", 0);

        alien.useHealOn(10, target);
        assertEquals(90, target.getHealth());
    }
}
