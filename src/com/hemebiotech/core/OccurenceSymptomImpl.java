package com.hemebiotech.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurenceSymptomImpl implements OccurenceSymptom {

    @Override
    public Map<String, Integer> getSymptomsOccurence(List<String> symptoms) {

        Map<String, Integer> symptomsOccurence = new HashMap<>();

        symptoms.forEach((String symptom) -> {
            int count = 1;
            if(symptomsOccurence.containsKey(symptom))
                count = symptomsOccurence.get(symptom) + 1;
            symptomsOccurence.put(symptom, count);
        });
        return symptomsOccurence;
    }
}
