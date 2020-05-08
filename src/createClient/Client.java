package createClient;


public abstract class Client {

    protected String categoryname = null;
    protected Number number;
    protected Name name;
    protected Address address;
    protected Meterday meterday;
    

    public abstract void clientInformation();
    
    public void setName(String categoryname){
        this.categoryname = categoryname;
    }
    
    public String getName(){
        return categoryname;
    }
    
    public String toString() {
        return this.categoryname + "\n";
    }

}
