package com.hemebiotech.core;

import java.util.List;
import java.util.TreeMap;

public class OccurenceSymptomImpl implements OccurenceSymptom {

    @Override
    public TreeMap<String, Integer> getSymptomsOccurence(List<String> symptoms) {

        TreeMap<String,Integer> symptomsOccurence = new TreeMap<>();

        symptoms.forEach((String symptom) -> {
            int count = 1;
            if(symptomsOccurence.containsKey(symptom))
                count = symptomsOccurence.get(symptom) + 1;
            symptomsOccurence.put(symptom, count);
        });
        return symptomsOccurence;
    }
}
