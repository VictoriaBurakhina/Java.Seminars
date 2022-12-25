//Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
//        Добавить пять элементов в множество.
//        Отсортировать значения используя итератор.
//        Отсортированный результат сохранить в LinkedHashSet
//        Создать TreeSet с компаратором.
//        Скопировать содержимое первого множества (HashSet) в TreeSet.
//

import java.util.*;
import java.util.stream.Collectors;

public class Seminar6 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(3);
        set.add(6);
        System.out.println(set);


        if (!set.isEmpty()) {
            Iterator<Integer> it = set.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
        Iterator<Integer> it = set.iterator();
        LinkedHashSet<Integer> ar = new LinkedHashSet<>();
        while (it.hasNext()) {
            ar.add(it.next());
        }

/**
 *
 */
        TreeSet<String> set2 = new TreeSet<>((o1, o2) -> {
            if (o1.equals(o2)) {
                return 0;
            }
            if (o1.compareTo(o2) > 0) {
                return 1;
            } else return -1;
        });
        set2.add("Один");
        set2.add("Два");
        set2.add("Два+один");
        set2.add("Два");
        set2.add("Два+один+три");
        System.out.println(set2);


        TreeSet<Integer> copySet = new TreeSet<>();
        copySet.addAll(set);
        System.out.println("copySet: " + copySet);
    }

}
