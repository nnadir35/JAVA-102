package AdventureGame.inventory;

public class Weapon extends Item{
    int damage;

    public int getDamage() {
        return damage;
    }
    public void setDamage(int d){
        this.damage = d;
    }
}
