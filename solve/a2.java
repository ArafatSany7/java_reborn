interface WBehavior {
    public void attack();
}

interface WType {
    public void WeaponType();
}

abstract class Weapon implements WBehavior, WType {

    abstract public void hasWeapon();

}

class Sowrd extends Weapon {
    public void attack() {
        System.out.println("Swing the sowrd");
    }

    public void WeaponType() {
        System.out.println("Weapon type meelee");
    }

    public void hasWeapon() {
        System.out.println("You have weapon");
    }
}

class Bow extends Weapon {
    @Override
    public void attack() {
        System.out.println("Shoot an arrow!");
    }

    @Override
    public void WeaponType() {
        System.out.println("Weapon Type: Ranged");
    }

    @Override
    public void hasWeapon() {
        System.out.println("You have a bow!");
    }
}

class meeleeFactory {
    public void meleeCreate() {
        System.out.println("Creating a melee weapon");
    }
}

interface ragedFactory {
    void createRangedWeapon();
}

class WeaponFactory extends meeleeFactory implements ragedFactory {

    public void meleeCreate() {

    }

    public void createRangedWeapon() {
        System.out.println("Ranged weapon is created");

    }
}

public class a2 {
    public static void main(String[] args) {

        Sowrd sowrd = new Sowrd();
        Bow bow = new Bow();

        sowrd.attack();
        sowrd.WeaponType();
        sowrd.hasWeapon();

    }

}
