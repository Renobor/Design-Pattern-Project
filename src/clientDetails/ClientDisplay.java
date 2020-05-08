package clientDetails;

class ClientDisplay {

    ClientComponent allClients;

    public ClientDisplay(ClientComponent allClients) {   //이거 다시 보기
        this.allClients = allClients;
    }

    public void allPrint() {
        allClients.clientPrint();
   
                
    }
}
