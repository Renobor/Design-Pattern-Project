package createClient;

public class GeneralClient extends Client {

    private ClientIngredientFactory ingredientFactory;

    public GeneralClient(ClientIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    public void clientInformation(){
        System.out.println(categoryname);
        this.number = ingredientFactory.createNumber();
        this.name = ingredientFactory.createName();
        this.address = ingredientFactory.createAddress();
        this.meterday = ingredientFactory.createMeterday();
    }
}
