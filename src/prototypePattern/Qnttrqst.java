package prototypePattern;

public class Qnttrqst extends Product {

    public static String qnttrqst[] = {"56.6499", "57.1111", "55.2412", "56.3995", "55.9931", "56.4958", "55.1234", "56.5656", "57.6656", "56.8871"};

    public Qnttrqst(String qnttrqst[]) {
        this.qnttrqst = qnttrqst;
    }

    public void print() {
        System.out.println("청구량");
        System.out.println("-------------------------------");
        for (int i = 0; i < qnttrqst.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(qnttrqst[i] + "MJ");
        }
    }

}
