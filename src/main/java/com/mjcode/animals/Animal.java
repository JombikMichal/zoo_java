package com.mjcode.animals;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Animal {
    private  String name;
    private String kind;
    private  Date birthDay;
    private Date yearOfDeath;
    private int legsCount;
    private double weight;
    private boolean isAlive;


    public Animal(){}

    public Animal(String kind,String name, Date birthDay, int legsCount, double weight, Date yearOfDeath){
        this.kind = kind;
        this.name = name;
        this.birthDay = birthDay;
        this.legsCount = legsCount;
        this.weight = weight;
        this.yearOfDeath = yearOfDeath;
        setAlive();
    }

    public abstract String getSound();

    private boolean wasBorn(){
        System.out.println(birthDay);
        return false;

    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public double getWeight() {
        return weight;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setAlive() {
        isAlive = !wasBorn() && yearOfDeath == null;
    }
}
