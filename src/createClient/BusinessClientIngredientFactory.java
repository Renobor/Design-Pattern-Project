package createClient;

class BusinessClientIngredientFactory implements ClientIngredientFactory {
    
    public Number createNumber() {
        return new BusinessNumber();
    }
     //Number타입으로 반환
    public Name createName() {
        return new BusinessName();
    }
    //Name타입으로 반환
    public Address createAddress() {
        return new BusinessAddress();
    }
    //Adress타입으로 반환
    public Meterday createMeterday() {
        return new BusinessMeterday();
    }
      //Meterday로 반환
}
