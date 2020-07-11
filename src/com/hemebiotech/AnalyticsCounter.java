package com.hemebiotech;

import com.hemebiotech.core.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String args[]) throws IOException {
        // get symptoms
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
        List symptoms = reader.getSymptoms();
        // get symptoms and occurences
        OccurenceSymptom occurenceSymptom = new OccurenceSymptomImpl();
        Map dataSymptomsOccurences = occurenceSymptom.getSymptomsOccurence(symptoms);
        // generate output
        GenerateSymptomOut generateSymptomOut = new GenerateSymptomOutImpl();
        String result =  generateSymptomOut.fileWriter(dataSymptomsOccurences);
        System.out.println(result);
    }
}
