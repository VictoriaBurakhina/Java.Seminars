//Создать словарь HashMap. Обобщение <Integer, String>.
//Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
// Изменить значения сделав пол большой буквой.
// Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."


import java.util.*;
import java.util.stream.Collectors;

public class Seminar5 {

    public static void main(String[] args) {
        HashMap<Integer, String> fioMap = new LinkedHashMap<>();
        fioMap.put(0, "Иванов Иван Иванович 45 м");
        fioMap.put(1, "Васильева Екатерина Сергеевна 45 ж");
        fioMap.put(2, "Петров Сергей Александрович 34 м");
        fioMap.put(3, "Дубровина Анастасия Игоревна 25 ж");
        fioMap.put(4, "Пузаков Валерий Ильич 35 м");

        print(fioMap);
        changeGenderToUpperCase(fioMap);
        System.out.println("After changeGenderToUpperCase......");
        print(fioMap);

        getNewFormat(fioMap);
        System.out.println("After getNewFormat......");
        print(fioMap);


    }


//    Изменить значения сделав пол большой буквой.

    static void changeGenderToUpperCase(Map<Integer, String> inputMap) {
        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            var arr = Arrays.stream(entry.getValue().split(" ")).collect(Collectors.toList());
            var index = arr.size() - 1;
            arr.set(index, arr.get(index).toUpperCase());
            entry.setValue(String.join(" ", arr));
        }
    }

    // Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
    static void getNewFormat(Map<Integer, String> inputMap) {
        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            var arr = Arrays.stream(entry.getValue().split(" ")).collect(Collectors.toList());
            arr.set(1, arr.get(1).substring(0, 1).concat("."));
            arr.set(2, arr.get(2).substring(0, 1).concat("."));
            entry.setValue(String.join(" ", arr));
        }
    }

    static void print(Map<Integer, String> inputMap) {
        for (Map.Entry<Integer, String> entry : inputMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}

