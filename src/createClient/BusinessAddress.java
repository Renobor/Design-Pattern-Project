package createClient;

class BusinessAddress implements Address {
    
    static String businessAddress[] = { "제주특별자치도 제주시 영평동 2181", "경기도 성남시 분당구 삼평동 627", "경기도 성남시 분당구 삼평동 668", "경기도 성남시 분당구 정자동 178-1", "서울특별시 중구 태평로2가 250" };
    
    public BusinessAddress() {
      System.out.println("-----------------------");
      System.out.println("기업 고객주소");
      System.out.println("-----------------------");
        for(int i=0; i < businessAddress.length; i++){
             System.out.println(businessAddress[i]);
      }
    }

}
