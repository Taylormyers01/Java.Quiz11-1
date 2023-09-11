package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements Iterable<_> {
    List<_> stuff = new ArrayList<>();
    public Group() {
    }

    public Integer count() {
        return stuff.size();
    }

    public void insert(_ value) {
        stuff.add(value);
    }

    public Boolean has(_ value) {
        return stuff.contains(value);
    }

    public _ fetch(int indexOfValue) {
        return stuff.get(indexOfValue);
    }

    public void delete(_ value) {
        stuff.remove(value);
    }

    public void clear() {
        stuff.clear();
    }

    public Iterator<_> iterator() {
        return stuff.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(stuff.get(0)).append(", ");
        for(int i = 1; i < stuff.size() - 1; i++){
            sb.append(stuff.get(i)).append(", ");
        }
        sb.append(stuff.get(stuff.size()-1)).append("]");

        return sb.toString();
    }
}
