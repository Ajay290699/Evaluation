package other;

import java.util.Comparator;

public class SortByNameDesc implements Comparator<Test> {
    @Override
    public int compare(Test o1, Test o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
