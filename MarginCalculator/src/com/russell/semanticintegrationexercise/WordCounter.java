package com.russell.semanticintegrationexercise;

import java.util.HashMap;
import java.util.Map;

public class WordCounter implements WordCountService {

	@Override
	public Map<String, Integer> countWords(String text) {

		Map<String, Integer> map = new HashMap<>();
		
		for (String word : text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+")) {
			map.compute(word, (key, value) -> value == null ? 1 : (value + 1));
		}
		
		return map;
		
	}

}
