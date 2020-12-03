package com.nazar.soft.xml;

public class Student {

    private String name;
    private Loot loot;

    public void setName(String name) {
        this.name = name;
    }

    public void setLoot(Loot loot) {
        this.loot = loot;
    }

    public void displayWhoIsLooting(){
        loot.lootingSomeStaff(name);
    }

}
