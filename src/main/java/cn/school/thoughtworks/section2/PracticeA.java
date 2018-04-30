package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < collection1.size(); i++) {
            if (map.containsKey(collection1.get(i))) {
                map.put(collection1.get(i), map.get(collection1.get(i)).intValue() + 1);
            } else {
                map.put(collection1.get(i), 1);
            }
        }
        return map;
    }
}
