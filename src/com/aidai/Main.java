package com.aidai;

public class GameEntity {
    private int hp;
    private int damage;

    public GameEntity(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}



public abstract class Hero extends GameEntity implements HavingSuperAbility{

    public Hero(int hp, int damage) {
        super(hp, damage);
    }
}



public class Magic extends Hero{
    public Magic(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}


public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(40, 50);
        Medic medic = new Medic(30, 10);
        Warrior warrior = new Warrior(50, 60);

        Hero[] Heroes = {magic,warrior,medic};
        for (int i = 0; i < Heroes.length  ; i++) {
            Heroes[i].applySuperAbility("огненный меч");
            Heroes[i].applySuperAbility("Крит уран");
            Heroes[i].applySuperAbility("Лечить");
            break;
        }

    }
}


public class Magic extends Hero{
    public Magic(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}


public class Magic extends Hero{
    public Magic(int hp, int damage) {
        super(hp, damage);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);
    }
}