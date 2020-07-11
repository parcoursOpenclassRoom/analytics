package com.hemebiotech.core;

import java.io.IOException;
import java.util.Map;

/**
 * generate an output for symptoms and occurrences
 *
 */
public interface GenerateSymptomOut {

    /**
     * @param symptomOccurence the list of symptoms and occurrences
     *
     * @return the name of the file containing the symptoms with the associated occurrences
     */
    String fileWriter(Map<String, Integer> symptomOccurence) throws IOException;
}
