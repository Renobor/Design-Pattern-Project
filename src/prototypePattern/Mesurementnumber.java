package prototypePattern;

public class Mesurementnumber extends Product {

    public static String mesurementnumber[] = {"CM159312075069", "CM159312075070", "CM159312075071", "CM159312075068", "CM159312075067", "CM159312075066", "CM159312075065", "CM159312075064", "CM159312075063", "CM1593120750692"};

    public Mesurementnumber(String mesurementnumber[]) {
        this.mesurementnumber = mesurementnumber;
    }

    public void print() {
        System.out.println("계량기번호");
        System.out.println("-------------------------------");
        for (int i = 0; i < mesurementnumber.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(mesurementnumber[i]);
        }
    }

}
