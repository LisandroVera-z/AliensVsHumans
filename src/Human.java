public class Human extends Entity{
    private int armor;
    private int medicine;


    public Human(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, int armor, int medicine) {
        super(name, health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.armor = armor;
        this.medicine = medicine;
    }

}
