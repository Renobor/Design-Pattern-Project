package prototypePattern;

public class NmbrfuelqnttIndc extends Product {

    public static String nmbrfuelqnttIndc[] = {"42.9970", "40.1100", "40.1234", "43.5938", "44.1211", "43.3854", "43.1221", "42.6929", "41.9999", "43.0000"};

    public NmbrfuelqnttIndc(String nmbrfuelqnttIndc[]) {
        this.nmbrfuelqnttIndc = nmbrfuelqnttIndc;
    }

    public void print() {
        System.out.println("열량계수");
        System.out.println("-------------------------------");
        for (int i = 0; i < nmbrfuelqnttIndc.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(nmbrfuelqnttIndc[i]);
        }
    }

}
