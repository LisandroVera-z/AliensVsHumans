public class Alien extends Entity{
    private int heal;
    private String species;

    public Alien(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, String species, int heal) {
        super(name, health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.species = species;
        this.heal = heal;

    }
}
