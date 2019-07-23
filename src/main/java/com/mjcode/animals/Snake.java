package com.mjcode.animals;

import java.util.Date;

public class Snake extends Animal implements IAnimals{
    public Snake(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        super( kind,name,  birthDay, legsCount, weight,yearOfDeath);
    }

    @Override
    public String getSound() { return "Im snake and Im animal! Who is more?";}

    @Override
    public String run() {
        return "Im snake and Im running";
    }
}
