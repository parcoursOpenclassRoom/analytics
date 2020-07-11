package com.hemebiotech.core;

import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class GenerateSymptomOutImpl implements GenerateSymptomOut {

    @Override
    public String fileWriter(TreeMap<String, Integer> symptomOccurence) throws IOException {

        String fileName = "result.out";
        FileWriter writer = new FileWriter (fileName);
        symptomOccurence.keySet().forEach((k)-> {
            try {
                writer.write(k+":" + symptomOccurence.get(k) + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
        return fileName;

    }
}
