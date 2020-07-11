package com.hemebiotech.core;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * from the list of symptoms, find the number of occurance
 *
 */
public interface OccurenceSymptom {

    /**
     * @param symptoms the list of symptoms
     *
     * @return a couple of key value (k,v) which includes the symptoms and the number of occurrences
     */
    TreeMap<String, Integer> getSymptomsOccurence (List<String> symptoms);
}
