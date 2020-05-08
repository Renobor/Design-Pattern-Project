package createClient;

class GeneralName implements Name {

    static String generalName[] = {"엄정환", "이동민", "박상진", "이태건", "황철민", "이원기", "전승철", "정성원", "김다슬", "김지원"};

    public GeneralName() {
        System.out.println("-----------------------");
        System.out.println("일반 고객이름");
        System.out.println("-----------------------");
        for (int i = 0; i < generalName.length; i++) {
            System.out.println(generalName[i]);
        }
    }

}
