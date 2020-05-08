
package createClient;


class BusinessName implements Name {

  static String businessName[] = { "카카오", "넥슨", "엔씨소프트", "네이버", "삼성" };

  public BusinessName() {
      System.out.println("-----------------------");
      System.out.println("기업이름");
      System.out.println("-----------------------");
      for(int i=0; i < businessName.length; i++){
          System.out.println(businessName[i]);
      }
    }
     
  
}
