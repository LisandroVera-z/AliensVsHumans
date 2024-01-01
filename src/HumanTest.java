import org.junit.Test;
import static org.junit.Assert.*;

public class HumanTest {

    @Test
    public void testHumanConstructor() {
        Human human = new Human(150, 30, "Gun", 20, "First Aid", 15, 20, 25);

        assertEquals(150, human.getHealth());
        assertEquals(30, human.attack);
        assertEquals("Gun", human.weapon);
        assertEquals(20, human.weaponDMG);
        assertEquals("First Aid", human.ability);
        assertEquals(15, human.abilityDMG);
        assertEquals(20, human.armor);
        assertEquals(25, human.medicine);
    }

    @Test
    public void testUseArmorOn() {
        Human human = new Human(150, 30, "Gun", 20, "First Aid", 15, 20, 25);
        Entity target = new Entity(100, 25, "Sword", 15, "Fireball", 20);

        human.useArmorOn(20, target);

        assertEquals(120, target.getHealth());
    }

    @Test
    public void testUseMedicineOn() {
        Human human = new Human(150, 30, "Gun", 20, "First Aid", 15, 20, 25);
        Entity target = new Entity(100, 25, "Sword", 15, "Fireball", 20);

        human.useMedicineOn(25, target);

        assertEquals(125, target.getHealth());
    }
}

