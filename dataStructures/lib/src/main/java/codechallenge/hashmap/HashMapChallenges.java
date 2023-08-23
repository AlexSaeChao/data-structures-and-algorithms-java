package codechallenge.hashmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.HashMap;

public class HashMapChallenges {
  public String getFirstRepeatedWord(String str) {
    if (str == null || str.isEmpty()) {
      return "";
    }

    HashMap<String, Integer> wordMap = new HashMap<>();
    String[] words = str.toLowerCase().split("[^a-zA-Z']+");
    // Split string into words using non-word characters but has issues with apostrophes

    for (String word : words) {
      int count = wordMap.getOrDefault(word, 0);
      if (count == 1) {
        return word;
      }
      wordMap.put(word, count + 1);
    }

    return "";
  }


}
