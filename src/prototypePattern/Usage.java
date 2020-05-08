package prototypePattern;

public class Usage extends Product {

    public static String usage[] = {"1.3175", "12.1234", "17.0000", "8.9999", "9.1111", "9.0000", "11.0000", "12.3333", "9.1111", "10.0000"};

    public Usage(String usage[]) {
        this.usage = usage;
    }

    public void print() {
        System.out.println("사용량");
        System.out.println("-------------------------------");
        for (int i = 0; i < usage.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(usage[i] + "m^3");
        }
    }

}
