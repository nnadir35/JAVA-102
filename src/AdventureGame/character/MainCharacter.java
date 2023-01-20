package AdventureGame.character;

public class MainCharacter extends GameCharacter {
    public MainCharacter(String name, int damage,int health,int money) {
        super.setId();
        super.setName(name);
        super.setHealth(health);
        super.setDamage(damage);
        super.setMoney(money);
    }

    @Override
    public String toString() {
        return "MainCharacter{" +
                "id=" + id +
                ", damage=" + damage +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", money=" + money +
                '}';
    }
}
