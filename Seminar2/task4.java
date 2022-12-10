//Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

package Seminar2;

public class task4 {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 3;
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(num1).append("+").append(num2).append("=").append(59);
        System.out.println(stringBuilder1);

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(num2).append("-").append(num1).append("=").append(-53);
        System.out.println(stringBuilder2);

        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(num2).append("*").append(num1).append("=").append(168);
        System.out.println(stringBuilder3);
    }
}
