public class Human extends Entity{
    private int armor;


    public Human(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, int armor) {
        super(name, health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.armor = armor;

    }

}
