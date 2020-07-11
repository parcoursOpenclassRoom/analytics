package com.hemebiotech.core;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class GenerateSymptomOutImpl implements GenerateSymptomOut {

    @Override
    public String fileWriter(Map<String, Integer> symptomOccurence) throws IOException {

        String fileName = "result.out";
        FileWriter writer = new FileWriter(fileName);
        symptomOccurence.forEach((k,v)-> {
            try {
                writer.write(k+":" + v + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
        return fileName;

    }
}
