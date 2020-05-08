package createClient;

class GeneralMeterday implements Meterday {
    
    static String generalMeterday[] = {"2017-05-20", "2017-05-10", "2017-05-15", "2017-01-30", "2017-02-27", "2017-03-22", "2017-01-31", "2017-03-03", "2017-04-26", "2017-04-15"};

    public GeneralMeterday() {
        System.out.println("-----------------------");
        System.out.println("일반 고객 최근 검침일");
        System.out.println("-----------------------");
        for (int i = 0; i < generalMeterday.length; i++) {
            System.out.println(generalMeterday[i]);
        }
    }

}
