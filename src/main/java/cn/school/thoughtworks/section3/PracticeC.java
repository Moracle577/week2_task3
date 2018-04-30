package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for (int i = 0; i < collectionA.size(); i++) {
            if (collection3.containsKey(collectionA.get(i))) {
                collection3.put(collectionA.get(i), collection3.get(collectionA.get(i)).intValue() + 1);
            } else {
                collection3.put(collectionA.get(i), 1);
            }
        }
        for (int j = 0; j < object.get("value").size(); j++) {
            if (collection3.containsKey(object.get("value").get(j))) {
                collection3.put(object.get("value").get(j),
                        collection3.get(object.get("value").get(j)).intValue() -
                                collection3.get(object.get("value").get(j)).intValue() / 3);
            }
        }
        return collection3;
    }

}
