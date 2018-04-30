package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();
        for (int i = 0; i < collectionA.size(); i++) {
            if (collectionA.get(i).length() == 1) {
                if (collection3.containsKey(collectionA.get(i))) {
                    collection3.put(collectionA.get(i), collection3.get(collectionA.get(i)).intValue() + 1);
                } else {
                    collection3.put(collectionA.get(i), 1);
                }
            }  else {
                String str = "";
                for (int j = 0; j < collectionA.get(i).length(); j++) {
                    if (collectionA.get(i).charAt(j) >= 48 && collectionA.get(i).charAt(j) <= 57) {
                        str += collectionA.get(i).charAt(j);
                    }
                }
                if (collection3.containsKey(collectionA.get(i).substring(0, 1))) {
                    collection3.put(collectionA.get(i).substring(0, 1),
                            collection3.get(collectionA.get(i).substring(0,1)).intValue() + Integer.valueOf(str));

                } else {
                    collection3.put(collectionA.get(i).substring(0,1), Integer.valueOf(str));
                }

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
