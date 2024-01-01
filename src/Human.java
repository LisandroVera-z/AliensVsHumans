public class Human extends Entity{
    public int armor;
    public int medicine;

    public Human(int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, int armor, int medicine) {
        super(health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.armor = armor;
        this.medicine = medicine;
    }

    public void useArmorOn(int armor, Entity name) {
        name.health += armor;
        System.out.println(name + " put on " + armor + " armor.");
    }

    public void useMedicineOn(int medicine, Entity name) {
        name.health += medicine;
        System.out.println(name + " drank " + medicine + " medicine.");
    }

}
