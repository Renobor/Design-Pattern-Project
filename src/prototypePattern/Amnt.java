package prototypePattern;

public class Amnt extends Product {

    public static String amnt[] = {"17360", "18120", "20190", "11190", "38020", "21199", "28789", "19111", "20011", "10111"};

    public Amnt(String amnt[]) {
        this.amnt = amnt;
    }

    public void print() {
        System.out.println("금액");
        System.out.println("-------------------------------");
        for (int i = 0; i < amnt.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(amnt[i] + "원");
        }
    }
}
