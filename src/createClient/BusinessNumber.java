package createClient;

class BusinessNumber implements Number {
    
    static String businessNumber[] = { "12345678", "87654321", "76548212", "15476982", "09674827" };
    
    public BusinessNumber() {
        System.out.println("-----------------------");
        System.out.println("기업 고객번호");
        System.out.println("-----------------------");
        
        for(int i=0; i < businessNumber.length; i++){
          System.out.println(businessNumber[i]);
      }
    }
}
