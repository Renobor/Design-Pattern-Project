package prototypePattern;

public class Trnsdate extends Product {

    public static String trnsdate[] = {"2017.06.05", "2016.02.01", "2017.04.29", "2016.10.09", "2017.11.10", "2018.01.12", "2016.07.01", "2017.05.21", "2017.02.01", "2016.10.09"};

    public Trnsdate(String trnsdate[]) {
        this.trnsdate = trnsdate;
    }

    public void print() {
        System.out.println("이체일자");
        System.out.println("-------------------------------");
        for (int i = 0; i < trnsdate.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(trnsdate[i]);
        }
    }

}
