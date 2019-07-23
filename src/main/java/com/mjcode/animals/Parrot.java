package com.mjcode.animals;

import java.util.Date;

public class Parrot  extends  Animal implements IAnimals{
    public Parrot(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        super( kind,name,  birthDay, legsCount, weight,yearOfDeath);
    }

    @Override
    public String getSound() { return "Im parrot and Im animal! Who is more?";}

    @Override
    public String run() {
        return "Im parrot and Im running";
    }
}
