package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> collection = new ArrayList<>();
        for (int i = 0; i < collection1.size(); i++) {
            if (collection2.get(0).contains(collection1.get(i))) {
                collection.add(collection1.get(i));
            }
        }
        return collection;
    }
}
