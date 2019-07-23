package com.mjcode.animals;

import java.util.Date;

public class Wolf extends  Animal implements IAnimals {

    public Wolf(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        super( kind,name,  birthDay, legsCount, weight,yearOfDeath);
    }

    @Override
    public String getSound() { return "Im wolf and Im animal! Who is more?";}

    @Override
    public String run() {
        return "Im wolf and Im running";
    }
}
