public class Alien extends Entity{
    private int heal;

    public Alien(String name, int health, int attack, String weapon, int weaponDMG, String ability, int abilityDMG, int heal) {
        super(name, health, attack, weapon, weaponDMG, ability, abilityDMG);
        this.heal = heal;

    }
}
