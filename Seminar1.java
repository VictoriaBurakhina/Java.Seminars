//Первый семинар.
//        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
//        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
//
//        Пункты реализовать в методе main


import java.util.ArrayList;
import java.util.Random;

public class Seminar1 {
    public static void main(String[] args) {

        int i = getRandomNumber();
        int n = getOldestBit(i);

        ArrayList<Integer> m1 = new ArrayList<>();          //так как мы не знаем длинну массива, использую ArrayList
        for (int j = 1; j < Short.MAX_VALUE; j++) {
            if (n % j == 0) {
                m1.add(j);
            }
        }

        ArrayList<Integer> m2 = new ArrayList<>();
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j != 0) {
                if (n % j != 0) {
                    m2.add(j);
                }
            }
        }

        System.out.println("m1 " + m1);
        System.out.println("m2 " + m2);

    }


    public static int getRandomNumber() {
        return new Random().nextInt(2001);
    }

    public static int getOldestBit(int num) {
        int res = 0;
        while (num != 1) {
            num >>= 1;
            res++;
        }
        return res;
    }



}


