package createClient;

class GeneralClientIngredientFactory implements ClientIngredientFactory {

    public Number createNumber() {
        return new GeneralNumber();
    }

    public Name createName() {
        return new GeneralName();
    }

    public Address createAddress() {
        return new GeneralAddress();
    }

    public Meterday createMeterday() {
        return new GeneralMeterday();
    }

}
