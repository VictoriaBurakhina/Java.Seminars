package Seminar2;//Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).


public class Seminar2 {
    static class stringContains {
        String txt;

        public void setTxt(String txt) {
            this.txt = txt;
        }

        public String getTxt() {
            return txt;
        }

        public void contains(String txt1, String txt2) {
            if (txt1.contains(txt2)) {
                System.out.println("Строка -" + txt1 + "содержит в себе строку " + txt2);
            } else
                System.out.println("Строки разные");
        }

        public static void main(String[] args) {
            stringContains word1 = new stringContains();
            word1.setTxt("C новым годом!");
            stringContains e = new stringContains();
            e.setTxt("нов");
            e.contains(word1.getTxt(), e.getTxt());
        }
    }
}
