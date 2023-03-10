package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Npc extends GameCharacter {
    public Npc(String name, int hitPoints, double dexterity, Weapon weapon) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.dexterity = dexterity;
        this.setEquippedWeapon(weapon);
    }

    static GameCharacter spawnNpc() {
        Random rnd = new Random();
        String[] names = {"Slimy Snail", "Fluffy Bear", "Fat Mongoose", "Wizard", "Ninja", "Santa Claus", "Angry Bulldog", "Dragon", "Rat"};
        ArrayList<Weapon> list = new ArrayList<>();
        list.add(new Weapon("Sword", 21));
        list.add(new Weapon("Fist", 15));
        list.add(new Weapon("Knife", 17));
        list.add(new Weapon("Flamethrower", 22));
        list.add(new Weapon("Ratchet", 14));
        list.add(new Weapon("Rock", 10));
        list.add(new Weapon("Pistol", 25));
        list.add(new Weapon("Shotgun", 30));
        list.add(new Weapon("Hammer", 12));
        list.add(new Weapon("Sniper Rifle", 35));
        return new Npc(names[rnd.nextInt(names.length)], rnd.nextInt(20) + 80, 0.5, list.get(rnd.nextInt(list.size())));
    }
}
