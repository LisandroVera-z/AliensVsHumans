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
}
