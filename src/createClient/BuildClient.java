package createClient;

abstract class BuildClient {
    //client의 정보를 담아서 뿌려주는 BuildClient
    protected abstract Client createClient(String category);
    
    public Client categoryClient(String type){
        Client client = null;
        
        client = createClient(type);
        
        client.clientInformation(); //클라이언트 정보를 담아서 BuildClient에 저장하고 리턴한다.
        return client;
    }

}
