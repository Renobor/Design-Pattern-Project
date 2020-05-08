package createClient;

public class BuildBusiness extends BuildClient {

    protected Client createClient(String category) {
        Client client = null;
        ClientIngredientFactory factory = new BusinessClientIngredientFactory();
        
        if(category.equals("business")){
        
            client = new BusinessClient(factory);
            client.setName("기업고객 리스트");
        
        }
        
        else if(category.equals("general")){
            
            client = new GeneralClient(factory);
            client.setName("일반고객 리스트");
        }
        
        return client;
    }

}
