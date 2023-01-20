package AdventureGame.inventory;

public class Armor extends Item {

    public Armor(int defence) {
        this.defence = defence;

    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    int defence;
}
