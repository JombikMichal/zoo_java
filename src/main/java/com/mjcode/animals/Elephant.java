package com.mjcode.animals;

import java.util.Date;

public class Elephant extends Animal implements  IAnimals{
    public Elephant(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        super( kind,name,  birthDay, legsCount, weight,yearOfDeath);
    }

    @Override
    public String getSound() { return "Im elephant and Im animal! Who is more?";}

    @Override
    public String run() {
        return "Im elephant and Im running";
    }
}
