package HW08.task3;

import java.util.HashSet;
import java.util.Set;

public class CustomSet<E> extends HashSet<E> {
    public Set<E> union(Set<E> set) {
        Set<E> result = new HashSet<>(this);
        result.addAll(set);
        return result;
    }

    public Set<E> intersect(Set<E> set) {
        Set<E> result = new HashSet<>(this);
        result.retainAll(set);
        return result;
    }

    public static void main(String[] args) {
        CustomSet<String> set1 = new CustomSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        CustomSet<String> set2 = new CustomSet<>();
        set2.add("banana");
        set2.add("orange");
        set2.add("grape");

        Set<String> unionSet = set1.union(set2);
        System.out.println("Объединение: " + unionSet);

        Set<String> intersectSet = set1.intersect(set2);
        System.out.println("Пересечение: " + intersectSet);
    }
}