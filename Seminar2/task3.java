//*Напишите программу, чтобы перевернуть строку с помощью рекурсии.


package Seminar2;

public class task3 {
    private static void swap(char[] a, int i, int j)
    {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Рекурсивная функция для обращения заданной строки
    public static void reverse(char[] a, int l, int h)
    {
        if (l < h)
        {
            swap(a, l, h);
            reverse(a, l + 1, h - 1);
        }
    }

    public static void main(String[] args)
    {
        String str = "Happy New Year";

        char[] a = str.toCharArray();
        reverse(a, 0, a.length - 1);
        str = new String(a);

        System.out.print("Reverse of this string is " + str);
    }
}