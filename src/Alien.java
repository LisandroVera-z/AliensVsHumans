public class Alien extends Entity{
    public int heal;
    public String species;

    public Alien(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, String species, int heal) {
        super(name, health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.species = species;
        this.heal = heal;

    }

    public void useHealOn(int heal, Entity name) {
        name.health += heal;
        System.out.println(name + " healed " + heal + " health.");
    }
}
