package com.hemebiotech.core;

import java.util.List;
import java.util.Map;

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
    Map<String, Integer> getSymptomsOccurence (List<String> symptoms);
}
