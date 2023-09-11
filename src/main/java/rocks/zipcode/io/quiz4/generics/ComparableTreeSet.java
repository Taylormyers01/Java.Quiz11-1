package rocks.zipcode.io.quiz4.generics;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class    ComparableTreeSet<_> extends TreeSet<_> implements Comparable<_>{
    Set<_> stuff = new TreeSet<>();
    public ComparableTreeSet(_... arr) {
        for(_ i: arr){
            stuff.add(i);
        }
    }


    public ComparableTreeSet() {
    }

    public int compareTo(ComparableTreeSet<_> o) {
        for(_ i: o){
            if(!stuff.contains(i)){
                return -1;
            }
        }
        return 1;
    }

    @Override
    public int compareTo(_ o) {
        if(stuff.contains(o)){
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return stuff.toString();
    }
    //    @Override
//    public Integer count() {
//        return stuff.size();
//    }
//
//    @Override
//    public Boolean has(_ valueToInsert) {
//        return stuff.contains(valueToInsert);
//    }
//
//    @Override
//    public _ fetch(int indexOfValue) {
//        for(int i = 0; i < stuff.size(); i++){
//            if(i == indexOfValue){
//                return (_)stuff.toArray()[i];
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public void insert(_ string) {
//
//    }
//
//    @Override
//    public void delete(_ valueToInsert) {
//
//    }
}
