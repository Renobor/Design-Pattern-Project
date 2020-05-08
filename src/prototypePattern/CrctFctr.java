package prototypePattern;

public class CrctFctr extends Product {

    public static String crctFctr[] = {"0.9888100", "0.9819899", "0.911222", "0.911100", "0.899999", "0.891815", "0.989999", "0.957711", "0.961456", "0.999111"};

    public CrctFctr(String crctFctr[]) {
        this.crctFctr = crctFctr;
    }

    public void print() {
        System.out.println("보정계수");
        System.out.println("-------------------------------");
        for (int i = 0; i < crctFctr.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(crctFctr[i]);
        }
    }

}
