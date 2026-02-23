interface GameCharacter {
    GameCharacter clone();

    void printInfo();
}

class Warrior implements GameCharacter {
    private String type = "warrior";
    private int health, attackPower, defence;
    private String weapon;

    public Warrior(String type, int health, int attackPower, int defence, String weapon) {
        this.type = type;
        this.health = health;
        this.attackPower = attackPower;
        this.defence = defence;
        this.weapon = weapon;
    }

    public GameCharacter clone() {
        return new Warrior(this.type, this.health, this.attackPower, this.defence, this.weapon);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void printInfo() {
        System.out.println("Type : " + type + "Health :" + health + "Attack Power: " + attackPower +
                "Defence : " + defence + "Weapon : " + weapon);
    }
}

public class GameClient {
    public static void main(String[] args) {

        GameCharacter protoWarior = new Warrior("Warrior", 00, 45, 45, "Soerd");

        Warrior w1 = (Warrior) protoWarior.clone();
        w1.setHealth(95);
        w1.setWeapon("Gun");

        ((Warrior) protoWarior).printInfo();

        w1.printInfo();

    }
}
