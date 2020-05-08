package prototypePattern;

public class Lastmonth extends Product {

    public static String lastmonth[] = {"276.0000", "176.0000", "181.0000", "211.0000", "231.0000", "111.0000", "211.0000", "201.0000", "191.0000", "189.0000"};

    public Lastmonth(String lastmonth[]) {
        this.lastmonth = lastmonth;
    }

    public void print() {
        System.out.println("전월지침");
        System.out.println("-------------------------------");
        for (int i = 0; i < lastmonth.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(lastmonth[i]);
        }
    }

}
