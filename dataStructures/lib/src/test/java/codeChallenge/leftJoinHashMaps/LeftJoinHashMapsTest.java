package codeChallenge.leftJoinHashMaps;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static codechallenge.leftJoinHashMaps.LeftJoinHashMaps.leftJoin;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeftJoinHashMapsTest {
  @Test
  public void testLeftJoin() {
    // Arrange
    HashMap<String, String> synonyms = new HashMap<>();
    synonyms.put("diligent", "employed");
    synonyms.put("fond", "enamored");
    synonyms.put("guide", "usher");
    synonyms.put("outfit", "garb");
    synonyms.put("wrath", "anger");

    HashMap<String, String> antonyms = new HashMap<>();
    antonyms.put("diligent", "idle");
    antonyms.put("fond", "averse");
    antonyms.put("guide", "follow");
    antonyms.put("flow", "jam");
    antonyms.put("wrath", "delight");

    List<List<String>> expected = new ArrayList<>();
    expected.add(List.of("diligent", "employed", "idle"));
    expected.add(List.of("outfit", "garb", "NULL"));
    expected.add(List.of("wrath", "anger", "delight"));
    expected.add(List.of("guide", "usher", "follow"));
    expected.add(List.of("fond", "enamored", "averse"));
//    expected.add(List.of("flow", "NULL", "jam"));  //Not needed


    // Act
    List<List<String>> result = leftJoin(synonyms, antonyms);

    // Assert
//    *** since the IDE displays it the results and expected in an odd order this helps if contents are the same but ignores order. ***
//    assertTrue(HashMapChallenges.areContentsEqualIgnoringOrder(expected, result));
    assertEquals(expected, result);
  }
}
