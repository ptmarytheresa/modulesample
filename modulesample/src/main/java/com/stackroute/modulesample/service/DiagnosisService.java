package com.stackroute.modulesample.service;

 

 
import java.util.ArrayList;
import java.util.List;

import com.stackroute.modulesample.model.Deficiency;

public class DiagnosisService {
    private List<Deficiency> database = new ArrayList<>();

    public DiagnosisService() {
        database.add(new Deficiency("Iron", "Fatigue, Pale Skin"));
        database.add(new Deficiency("Vitamin D", "Bone Pain, Weakness"));
    }

    public void diagnose(String symptom) {
        System.out.println("Analyzing symptom: " + symptom);
        for (Deficiency d : database) {
            if (d.getSymptoms().toLowerCase().contains(symptom.toLowerCase())) {
                System.out.println("Result found: " + d);
            }
        }
    }
}

