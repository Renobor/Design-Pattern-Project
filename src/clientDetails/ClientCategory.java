package clientDetails;



import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ClientCategory extends ClientComponent {

    private String category;
    //private ArrayList clientComponent = new ArrayList();
    private List<ClientComponent> clientComponent = new ArrayList<ClientComponent>();
    
    public ClientCategory(String category) {
        this.category = category;
        //str = new StringBuffer();
    }

    public void add(ClientComponent client) {
        clientComponent.add(client);
        //clientComponent.add(client);
        //System.out.println(clientComponent.size());
    }

    public void remove(ClientComponent client) {
        if(clientComponent.contains(client)){
            clientComponent.remove(client);
        }
        //clientComponent.remove(client);
    }

    public void clear() {
        clientComponent.clear();
    }
    
    public String clientCategory() {
        return category;
    }

    public void clientPrint() {
        System.out.println(clientCategory());
        System.out.println("\n===========================\n");
        System.out.println("\n");
        
        Iterator iterator = clientComponent.iterator();
        for(ClientComponent comp : clientComponent){
            comp.clientPrint();
        }
    }

}
