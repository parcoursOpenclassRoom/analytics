package com.hemebiotech.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Access symptoms from a file
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() {
        ArrayList<String> result = new ArrayList<String>();
        if (filepath != null) {
            try {
                // get input
                FileReader filereader = new FileReader(filepath);
                BufferedReader reader = new BufferedReader(filereader);
                String line = reader.readLine();
                // each symptom is added to the list
                while (line != null) {
                    result.add(line);
                    line = reader.readLine();
                }
                // close resources
                reader.close();
                filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
