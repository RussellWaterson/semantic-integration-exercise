package com.russell.semanticintegrationexercise;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class WordCountServiceTest {

	@Test
	public void testWordCountService() {
		
		WordCountService wordCountService = new WordCounter();
		
		//When the string is empty, it should return an empty map
		assertEquals("Result", Collections.<String, Integer>emptyMap(), wordCountService.countWords(" "));
		
		//When there is different punctuation, letter cases, and whitespace
		Map<String, Integer> expected = new HashMap<>();
		expected.put("hello", 7);
		assertEquals("Result", expected, wordCountService.countWords("Hello hello hello! hello. hello!? 	hello\n hello"));
		
		//When there is a normal string with a mixture of words, punctuation, and letter cases
		expected.clear();
		expected.put("hello", 1);
		expected.put("my", 1);
		expected.put("name", 1);
		expected.put("is", 1);
		expected.put("russell", 1);
		assertEquals("Result", expected, wordCountService.countWords("Hello, my name is Russell."));
		
	}

}
