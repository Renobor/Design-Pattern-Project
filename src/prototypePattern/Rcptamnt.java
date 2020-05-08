package prototypePattern;

public class Rcptamnt extends Product {

    public static String rcptamnt[] = {"2017.05.05", "2016.01.01", "2017.03.29", "2016.09.09", "2017.10.10", "2017.12.12", "2016.05.31", "2017.04.21", "2017.01.01", "2016.09.09"};

    public Rcptamnt(String rcptamnt[]) {
        this.rcptamnt = rcptamnt;
    }

    public void print() {
        System.out.println("금액수납일");
        System.out.println("-------------------------------");
        for (int i = 0; i < rcptamnt.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(rcptamnt[i]);
        }
    }

}
