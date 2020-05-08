package createClient;

class GeneralNumber implements Number {

    static String generalNumber[] = {"20133278", "20113827", "20123421", "20133140", "20133279", "20133275", "20133280", "20133273", "20153278", "20153277"};

    public GeneralNumber() {
        System.out.println("-----------------------");
        System.out.println("일반 고객번호");
        System.out.println("-----------------------");
        for (int i = 0; i < generalNumber.length; i++) {
            System.out.println(generalNumber[i]);
        }
    }

}
