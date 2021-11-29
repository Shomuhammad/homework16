package com.company;

public class Cat {
    private String sound;
    private int age;
    boolean male;

    public Cat(String sound, int age, boolean male) {
        this.sound = sound;
        this.age = age;
        this.male = male;
    }

    public String getSound() {
        return sound;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }
}
