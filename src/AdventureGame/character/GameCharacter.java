package AdventureGame.character;

public abstract class GameCharacter {
    static int characterId = 1;
    int id;
    int damage;
    String name;
    int health;
    int money;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }



    public int getId() {
        return id;
    }

    public void setId() {
        this.id = characterId;
        characterId++;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth(){
        return health;
    }
    public void setHealth(int h){
        this.health = h;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
