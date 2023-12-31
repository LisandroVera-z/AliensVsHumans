public class Entity {
    public String name;
    public int health;
    public int attack;
    public String weapon;
    public int weaponDMG;
    public String ability;
    public int abilityDMG;

    public Entity(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.weaponDMG = weaponDMG;
        this.ability = ability;
        this.abilityDMG = abilityDMG;
    }

    public int getHealth() {
        return health;
    }

    public void useAttackOn(int attack, Entity name) {
        System.out.println("Attack hit " + name);
        name.health -= attack;
        System.out.println(name + " took " + attack + " damage.");
    }

    public void useWeaponOn(String weapon, int weaponDMG, Entity name) {
        System.out.println(weapon + " fired at " + name);
        name.health -= weaponDMG;
        System.out.println(name + " took " + weaponDMG + " damage.");
    }

    public void useAbilityOn(String ability, int abilityDMG, Entity name) {
        System.out.println(ability + " used on " + name);
        name.health -= abilityDMG;
        System.out.println(name + " took " + abilityDMG + " damage.");
    }

}
