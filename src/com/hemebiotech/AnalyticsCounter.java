package com.hemebiotech;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AnalyticsCounter {

    public static void main(String args[]) throws IOException {
        // get input
        FileReader filereader = new FileReader("symptoms.txt");
        BufferedReader reader = new BufferedReader(filereader);
        String line = reader.readLine();

        Map<String, Integer> symptoms = new HashMap<>();
        try{
            // processing of each line
            // we check if the element exists, we increment otherwise we add
            while (line != null) {
                int count = 1;
                if(symptoms.containsKey(line))
                    count = symptoms.get(line) + 1;
                symptoms.put(line, count);
                line = reader.readLine();
            }
        }catch (IOException e){
            // Any problem ?, An exception is raised
            e.printStackTrace();
        }finally {
            // resource closure
            try {
                if (reader != null)
                    reader.close();
                if (filereader != null)
                    filereader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // generate output by browsing the key value object
        FileWriter writer = new FileWriter("result.out");
        symptoms.forEach((k,v)-> {
            try {
                writer.write(k+":" + v + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
