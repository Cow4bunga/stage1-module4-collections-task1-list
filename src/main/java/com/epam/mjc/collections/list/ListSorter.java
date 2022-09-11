package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);

        int res1 = 5 * a1 * a1 + 3;
        int res2 = 5 * a2 * a2 + 3;
        if (res1 == res2) {
            return Integer.compare(a1, a2);
        } else return Integer.compare(res1, res2);
    }
}