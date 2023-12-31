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

    public void useWeaponOn(String weapon, int weaponDMG, Entity name) {
        int enemyHealth = name.getHealth();
        System.out.println(weapon + " fired at " + name);
        enemyHealth = enemyHealth - weaponDMG;
        System.out.println(name + " took " + weaponDMG + " damage.");
    }

    public void useAbilityOn(String ability, int abilityDMG, Entity name) {
        int enemyHealth = name.getHealth();
        System.out.println(ability + " used on " + name);
        enemyHealth = enemyHealth - abilityDMG;
        System.out.println(name + " took " + abilityDMG + " damage.");
    }

}
