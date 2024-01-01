import org.junit.Test;
import static org.junit.Assert.*;

public class EntityTest {

    @Test
    public void testConstructor() {
        Entity entity = new Entity(100, 20, "Sword", 10, "Fireball", 15);

        assertEquals(100, entity.getHealth());
        assertEquals(20, entity.attack);
        assertEquals("Sword", entity.weapon);
        assertEquals(10, entity.weaponDMG);
        assertEquals("Fireball", entity.ability);
        assertEquals(15, entity.abilityDMG);
    }

    @Test
    public void testUseAttackOn() {
        Entity attacker = new Entity(100, 20, "Sword", 10, "Fireball", 15);
        Entity target = new Entity(100, 15, "Axe", 12, "Ice Shard", 20);

        attacker.useAttackOn(attacker, 10, target);

        assertEquals(90, target.getHealth());
    }

    @Test
    public void testUseWeaponOn() {
        Entity attacker = new Entity(100, 20, "Sword", 10, "Fireball", 15);
        Entity target = new Entity(100, 15, "Axe", 12, "Ice Shard", 20);

        attacker.useWeaponOn(attacker, "Sword", 10, target);

        assertEquals(90, target.getHealth());
    }

    @Test
    public void testUseAbilityOn() {
        Entity attacker = new Entity(100, 20, "Sword", 10, "Fireball", 15);
        Entity target = new Entity(100, 15, "Axe", 12, "Ice Shard", 20);

        attacker.useAbilityOn(attacker, "Fireball", 15, target);

        assertEquals(85, target.getHealth());
    }
}



