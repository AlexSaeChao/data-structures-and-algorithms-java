package codechallenge.leftJoinHashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeftJoinHashMaps {
  public static List<List<String>> leftJoin(HashMap<String, String> synonyms, HashMap<String, String> antonyms) {
    List<List<String>> result = new ArrayList<>();

    for (String key : synonyms.keySet()) {
      List<String> row = new ArrayList<>();
      row.add(key);
      row.add(synonyms.get(key));
      row.add(antonyms.getOrDefault(key, "NULL"));
      result.add(row);
    }

    return result;
  }
//         *** since the IDE displays it the results and expected in an odd order this helps if contents are the same but ignores order.***
//    public static boolean areContentsEqualIgnoringOrder(List<List<String>> list1, List<List<String>> list2) {
//        return list1.size() == list2.size() && new HashSet<>(list1).containsAll(list2) && new HashSet<>(list2).containsAll(list1);
//    }

}
