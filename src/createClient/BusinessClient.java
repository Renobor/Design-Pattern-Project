package createClient;

public class BusinessClient extends Client {

    private ClientIngredientFactory ingredientFactory;
    //ClientIngredientFactory를 들고온다.
    public BusinessClient(ClientIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    
    public void clientInformation(){
        System.out.println(categoryname);
        this.number = ingredientFactory.createNumber();
        this.name = ingredientFactory.createName();
        this.address = ingredientFactory.createAddress();
        this.meterday = ingredientFactory.createMeterday();
        //들고온 IngredientFactory를  Client에 상속받으니 담을수있기에 전역변수로 담아버린다. 
    }
}
