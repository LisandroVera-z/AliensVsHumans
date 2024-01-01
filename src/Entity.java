public class Entity {
    public int health;
    public int attack;
    public String weapon;
    public int weaponDMG;
    public String ability;
    public int abilityDMG;
    protected int row;
    protected int col;

    public Entity(int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG) {
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.weaponDMG = weaponDMG;
        this.ability = ability;
        this.abilityDMG = abilityDMG;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public int getHealth() {
        return health;
    }

    public void useAttackOn(Entity attacker, int attack, Entity target) {
        System.out.println(attacker + " Attacked " + target);
        target.health -= attack;
        System.out.println(target + " took " + attack + " damage.");
    }

    public void useWeaponOn(Entity attacker, String weapon, int weaponDMG, Entity target) {
        System.out.println(attacker + " fired " + weapon + " at " + target);
        target.health -= weaponDMG;
        System.out.println(target + " took " + weaponDMG + " damage.");
    }

    public void useAbilityOn(Entity attacker, String ability, int abilityDMG, Entity target) {
        System.out.println(attacker + " used " + ability + " at " + target);
        target.health -= abilityDMG;
        System.out.println(target + " took " + abilityDMG + " damage.");
    }

}
