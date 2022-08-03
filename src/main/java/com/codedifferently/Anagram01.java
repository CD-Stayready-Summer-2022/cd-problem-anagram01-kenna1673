package com.codedifferently;


import java.util.*;

public class Anagram01 {

    public static String[] problem(String inputWord, String[] inputWordList){
        Map<Character, Integer> inputMap = new HashMap<>();
        ArrayList<String> anagrams = new ArrayList<>();
        for (int i = 0; i < inputWord.length(); i++) {
            Character current = inputWord.charAt(i);
            int count = inputMap.getOrDefault(current, 0);
            inputMap.put(current, ++count);
        }

        for (String word : inputWordList) {
            Map<Character, Integer> wordMap = new HashMap<>();
            for (int i = 0; i < word.length(); i++) {
                Character current = word.charAt(i);
                int count = wordMap.getOrDefault(current, 0);
                wordMap.put(current, ++count);
            }
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
}
