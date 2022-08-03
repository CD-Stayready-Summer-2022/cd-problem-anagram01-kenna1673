# Am I an Anagram 

An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.[1] For example, the word anagram itself can be rearranged into nag a ram, also the word binary into brainy and the word adobe into abode.

You will be given a word `inputWord` , and a array of additional words `inputWordList`. Your job is to see which words in `inputWordList` are anagrams of `inputWord`.

The words do not need to be the same length, as long as their are enough letters in `inputWord` to make the anagram.

### Example

```
String inputWord = "water"
String[] inputWords = {"tawer", "wear", "rate", "mate", "fate"}


// Should return 

String[] response = {"tawer", "wear", "rate"}

tawer can be made from water
wear can be made from the letters in water
rate can be made from the letters with water
mate can NOT be made from the letters in water no m
fate can NOT be made from the letters in water no f
```

> The order of the words in the response array are irrelevant