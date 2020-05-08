package createClient;

class BusinessMeterday implements Meterday {
    
    static String businessMeterday[] = { "2017-03-20", "2017-03-15", "2017-03-08", "2017-03-10", "2017-05-20" };

    public BusinessMeterday() {
      System.out.println("-----------------------");
      System.out.println("기업 최근 검침일");
      System.out.println("-----------------------");
        for(int i=0; i < businessMeterday.length; i++){
          System.out.println(businessMeterday[i]);
      }
    }

}
