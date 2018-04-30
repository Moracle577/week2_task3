package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < collection1.size(); i++) {
            if (collection1.get(i).length() == 1) {
                if (map.containsKey(collection1.get(i))) {
                    map.put(collection1.get(i), map.get(collection1.get(i)).intValue() + 1);
                } else {
                    map.put(collection1.get(i), 1);
                }
            }  else {
                String str = "";
                for (int j = 0; j < collection1.get(i).length(); j++) {
                    if (collection1.get(i).charAt(j) >= 48 && collection1.get(i).charAt(j) <= 57) {
                        str += collection1.get(i).charAt(j);
                    }
                }
                if (map.containsKey(collection1.get(i).substring(0, 1))) {
                    map.put(collection1.get(i).substring(0, 1),
                            map.get(collection1.get(i).substring(0,1)).intValue() + Integer.valueOf(str));

                } else {
                    map.put(collection1.get(i).substring(0,1), Integer.valueOf(str));
                }

            }

        }
        return map;
    }
}
