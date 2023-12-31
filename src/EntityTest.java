import org.junit.Test;
import static org.junit.Assert.*;

public class EntityTest {

    @Test
    public void testEntityConstructor() {
        String testName = "TestEntity";
        int testHealth = 100;
        int testAttack = 10;
        String testWeapon = "Sword";
        int testWeaponDMG = 15;
        String testAbility = "Fireball";
        int testAbilityDMG = 30;

        Entity entity = new Entity(testName, testHealth, testAttack, testWeapon, testWeaponDMG, testAbility, testAbilityDMG);

        // Test that the fields are set correctly
        assertEquals(testName, entity.name);
        assertEquals(testHealth, entity.health);
        assertEquals(testAttack, entity.attack);
        assertEquals(testWeapon, entity.weapon);
        assertEquals(testWeaponDMG, entity.weaponDMG);
        assertEquals(testAbility, entity.ability);
        assertEquals(testAbilityDMG, entity.abilityDMG);
    }

    @Test
    public void testGetHealth() {
        Entity entity = new Entity("TestEntity", 100, 20, "Sword", 15, "Fireball", 30);
        assertEquals(100, entity.getHealth());
    }

    @Test
    public void testUseAttackOn() {
        Entity attacker = new Entity("Attacker", 100, 20, "Sword", 15, "Fireball", 30);
        Entity target = new Entity("Target", 100, 20, "Axe", 10, "Shield", 0);

        attacker.useAttackOn(10, target);
        assertEquals(90, target.getHealth());
    }

    @Test
    public void testUseWeaponOn() {
        Entity attacker = new Entity("Attacker", 100, 20, "Sword", 15, "Fireball", 30);
        Entity target = new Entity("Target", 100, 20, "Axe", 10, "Shield", 0);

        attacker.useWeaponOn("Sword", 15, target);
        assertEquals(85, target.getHealth());
    }

    @Test
    public void testUseAbilityOn() {
        Entity attacker = new Entity("Attacker", 100, 20, "Sword", 15, "Fireball", 30);
        Entity target = new Entity("Target", 100, 20, "Axe", 10, "Shield", 0);

        attacker.useAbilityOn("Fireball", 30, target);
        assertEquals(70, target.getHealth());
    }
}
