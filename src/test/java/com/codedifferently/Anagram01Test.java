package com.codedifferently;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class Anagram01Test {

    @Test
    public void problemTest01(){
        String inputWord = "water";
        String[] inputWordList = {"tawer", "wear", "rate", "mate", "fate"};
        List<String> actual = Arrays.asList(Anagram01.problem(inputWord, inputWordList));
        assertThat(actual, hasItem("tawer"));
        assertThat(actual, hasItem("rate"));
        assertThat(actual, hasItem("wear"));
    }

    @Test
    public void problemTest02(){
        String inputWord = "victory";
        String[] inputWordList = {"victor", "ivory", "rate", "city", "fate", "toy"};
        List<String> actual = Arrays.asList(Anagram01.problem(inputWord, inputWordList));
        assertThat(actual, hasItem("victor"));
        assertThat(actual, hasItem("ivory"));
        assertThat(actual, hasItem("city"));
        assertThat(actual, hasItem("toy"));
    }

    @Test
    public void problemTest03(){
        String inputWord = "challenge";
        String[] inputWordList = {"change", "leach", "angel", "city", "fate", "glance"};
        List<String> actual = Arrays.asList(Anagram01.problem(inputWord, inputWordList));
        assertThat(actual, hasItem("change"));
        assertThat(actual, hasItem("glance"));
        assertThat(actual, hasItem("leach"));
        assertThat(actual, hasItem("angel"));
    }
}
