package com.codedifferently;


import com.sun.jdi.IntegerValue;

import java.util.*;

public class Anagram01 {

    public static String[] problem(String inputWord, String[] inputWordList){
        Map<Character, Integer> inputMap = generateMap(inputWord);
        ArrayList<String> anagrams = new ArrayList<>();

        for (String word : inputWordList) {
            Map<Character, Integer> wordMap = generateMap(word);

            boolean flag = false;
            for (Character character : wordMap.keySet()) {
                Integer inputFrequency = inputMap.get(character);
                Integer wordFrequency = wordMap.get(character);
                if (inputFrequency == null) {
                    flag = false;
                    break;
                } else if (wordFrequency <= inputFrequency) {
                    flag = true;
                }
            }
            if (flag) anagrams.add(word);
        }
        return anagrams.toArray(new String[0]);
    }

    private static Map<Character, Integer> generateMap(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            int count = map.getOrDefault(current, 0);
            map.put(current, ++count);
        }
        return map;
    }
}
