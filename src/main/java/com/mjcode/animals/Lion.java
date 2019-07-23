package com.mjcode.animals;

import java.util.Date;

public class Lion extends Animal implements IAnimals {

    public Lion(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        super( kind,name,  birthDay, legsCount, weight,yearOfDeath);
    }

    @Override
    public String run() {
        return "Im lion and Im running";
    }

    @Override
    public String getSound() { return "Im lion and Im animal! Who is more?";}
}
