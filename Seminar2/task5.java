//Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
//*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().



package Seminar2;

public class task5 {
    public static void main(String[] args) {
        StringBuilder abc = new StringBuilder();
        abc.append("5*5=25");
        System.out.println(abc);

        abc.delete(3,4);
        abc.insert(3,"равно");
        System.out.println(abc);

        abc.replace(3,8,"=");
        System.out.println(abc);
    }
}
