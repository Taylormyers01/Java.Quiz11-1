package rocks.zipcode.io.quiz4.generics;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> implements GroupInterface<_>, Comparable<_> {

    List<_> group = new ArrayList<>();
    @Override
    public void insert(_ value) {
        group.add(value);
    }

    @Override
    public void delete(_ value) {
        group.remove(value);
    }

    public Integer indexOf(_ value) {
        return group.indexOf(value);
    }

    @Override
    public int compareTo(_ o) {
        return 0;
    }
}
