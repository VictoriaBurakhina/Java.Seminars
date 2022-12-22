//Написать приложение для ввода ФИО, возраста и пола пользователей. Данные хранить в разных списках.
//Добавить методы для сортировки пользователей по возрасту полу и первой букве фамилии.
//*Добавить возможность одновременной сортировки по двум параметрам.
// **Добавить возможность одновременной сортировки по трём параметрам.


import java.util.*;

public class Seminar4 {
    static List<String> list_fname = new ArrayList<>();
    static List<String> list_lname = new ArrayList<>();
    static List<String> list_tname = new ArrayList<>();
    static List<Integer> list_age = new ArrayList<>();
    static List<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    public static void main(String[] args) {

        putTo("Andreev Ivan Ivanovich", 24, "M");
        putTo("Lypin Fedr Ivanovich", 16, "M");
        putTo("Petrov Strepan Ivanovich", 51, "M");
        putTo("Kruchkova Olga Ivanovna", 36, "F");
        putTo("Ivanova Anna Ivanovna", 16, "F");
        putTo("Stepanova Sveta Ivanovich", 35, "F");
        putTo("Bobrov Stepan Ivanovich", 34, "M");

//        sortByAge(linkedlist);
//        list_lname = sortByStrings(list_lname);
        sortByAgeAndByFname(null, list_fname);

        linkedlist.forEach(i -> System.out.println(list_lname.get(i) + " " + list_fname.get(i) + " " + list_tname.get(i) + " " + list_age.get(i) + " " + list_sex.get(i)));

    }

    static void putTo(String fio, int age, String gender) {
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        if (gender.contains("F")) {
            list_sex.add(true);
        } else {
            list_sex.add(false);
        }
        linkedlist.add(list_age.size() - 1);
    }

    static void sortByAge(List<Integer> linkedlist) {
        int cnt = linkedlist.size() - 1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++) {
                if (max_age < list_age.get(linkedlist.get(i))) {
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }


    }

    static List<String> sortByStrings(List<String> list) {
        var strings = list.stream().toArray(String[]::new);
        var result = mergeSort(strings, 0, strings.length - 1);
        var resultList =  Arrays.asList(result);
        return resultList;
    }

    static String[] mergeSort(String[] Arr,
                              int lo, int hi) {
        if (lo == hi) {
            String[] A = {Arr[lo]};
            return A;
        }
        int mid = lo + (hi - lo) / 2;
        String[] arr1 = mergeSort(Arr, lo, mid);
        String[] arr2 = mergeSort(Arr, mid + 1, hi);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(
            String[] Arr1, String[] Arr2) {
        int m = Arr1.length;
        int n = Arr2.length;
        String[] Arr3 = new String[m + n];

        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(
                    Arr1[i], Arr2[j])) {

                Arr3[idx] = Arr1[i];
                i++;
                idx++;
            } else {
                Arr3[idx] = Arr2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            Arr3[idx] = Arr1[i];
            i++;
            idx++;
        }
        while (j < n) {
            Arr3[idx] = Arr2[j];
            j++;
            idx++;
        }
        return Arr3;
    }

    static boolean isAlphabeticallySmaller(
            String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    static void sortByAgeAndByFname(List<Integer>ageList, List<String>list_fname) {
        if (ageList != null) {
            Collections.sort(ageList);
        } else if (list_fname != null) {
            Collections.sort(list_fname);
        } else {
            System.out.println("Нет параметров сортировки");
        }
    }
}



