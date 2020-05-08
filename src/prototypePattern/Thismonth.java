package prototypePattern;

public class Thismonth extends Product {

    public static String thismonth[] = {"282.6666", "188.1234", "198.0000", "219.9999", "240.1111", "120.0000", "222.0000", "213.3333", "200.1111", "199.0000"};

    public Thismonth(String thismonth[]) {
        this.thismonth = thismonth;
    }

    public void print() {
        System.out.println("당월지침");
        System.out.println("-------------------------------");
        for (int i = 0; i < thismonth.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(thismonth[i]);
        }
    }

}
