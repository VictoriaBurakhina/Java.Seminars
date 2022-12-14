import java.util.*;

public class Seminar3 {
    public static void main(String[] args) {
        List<String> colours = new ArrayList<>();
        colours.add("green");
        colours.add("red");
        colours.add("yellow");
        colours.add("purple");
        colours.add("white");


        for (String str : colours) {
            System.out.println(str);
        }
        Iterator<String> stringIterator = colours.listIterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next() + "!");
        }

        colours.add(0, "brown");
        for (String str : colours) {
            System.out.println(str);
        }

        colours.remove(3);
        for (String str : colours) {
            System.out.println(str);
        }

        colours.set(1, "black");
        for (String str : colours) {
            System.out.println(str);
        }

        colours.remove(3);
        for (String str : colours) {
            System.out.println(str);
        }
        if (colours.contains("brown")) {
            System.out.println("/n Brown содержится в списке под индексом-" + colours.indexOf("brown"));
        } else
            System.out.println("Такого цвета в списке нет");


        ArrayList<String> newColours = new ArrayList<>();
        newColours.add("Pink");
        newColours.add("Orange");
        newColours.add("Blue");
        newColours.addAll(0, colours.subList(0, 2));

        for (String str : newColours) {
            System.out.println(str);
        }
        System.out.println(newColours);


        colours.removeAll(newColours);

        for (String res : newColours) {
            System.out.println(res);
        }
       colours.sort(String::compareTo);
        for (String res : colours) {
            System.out.println(res);
        }

    }
}


