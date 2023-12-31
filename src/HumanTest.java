import org.junit.Test;
import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void testHumanConstructor() {
        String testName = "TestHuman";
        int testHealth = 100;
        int testAttack = 20;
        String testWeapon = "Sword";
        int testWeaponDMG = 15;
        String testAbility = "Fireball";
        int testAbilityDMG = 30;
        int testArmor = 10;
        int testMedicine = 25;

        Human human = new Human(testName, testHealth, testAttack, testWeapon, testWeaponDMG, testAbility, testAbilityDMG, testArmor, testMedicine);

        // Test that the fields are set correctly
        assertEquals(testName, human.name);
        assertEquals(testHealth, human.health);
        assertEquals(testAttack, human.attack);
        assertEquals(testWeapon, human.weapon);
        assertEquals(testWeaponDMG, human.weaponDMG);
        assertEquals(testAbility, human.ability);
        assertEquals(testAbilityDMG, human.abilityDMG);
        assertEquals(testArmor, human.armor);
        assertEquals(testMedicine, human.medicine);
    }

    @Test
    public void testUseArmorOn() {
        Human human = new Human("TestHuman", 100, 20, "Sword", 15, "Fireball", 30, 10, 25);
        Entity target = new Entity("Target", 100, 20, "Axe", 10, "Shield", 0);

        human.useArmorOn(5, target);
        assertEquals(105, target.getHealth());
    }

    @Test
    public void testUseMedicineOn() {
        Human human = new Human("TestHuman", 100, 20, "Sword", 15, "Fireball", 30, 10, 25);
        Entity target = new Entity("Target", 80, 20, "Axe", 10, "Shield", 0);

        human.useMedicineOn(20, target);
        assertEquals(100, target.getHealth());
    }
}
