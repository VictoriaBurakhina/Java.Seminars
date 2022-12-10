package Seminar2;//\Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class task2 {

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "edcba";

        StringBuilder stringBuilder = new StringBuilder(str1);
        String res = stringBuilder.reverse().toString();

        System.out.println(res.equals(str2));

    }


}
