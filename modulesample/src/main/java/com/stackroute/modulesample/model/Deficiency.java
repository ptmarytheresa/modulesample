package com.stackroute.modulesample.model;
 

public class Deficiency {
    private String name;
    private String symptoms;

    public Deficiency(String name, String symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    public String getSymptoms() { return symptoms; }
    
    @Override
    public String toString() { return "Deficiency: " + name; }
}
