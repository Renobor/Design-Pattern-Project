package createClient;

class BuildGeneral extends BuildClient {
   //일반고객클라이언트 메서드
    protected Client createClient(String category) {
        Client client = null;
        ClientIngredientFactory factory = new GeneralClientIngredientFactory();
        
        if (category.equals("business")) {
            client = new BusinessClient(factory);
            client.setName("기업고객 리스트");
        } else if (category.equals("general")) {
            client = new GeneralClient(factory);
            client.setName("일반고객 리스트");
        }
        return client;
    }

}
