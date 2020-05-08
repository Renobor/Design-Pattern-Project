package clientDetails;

//생산자

public abstract class ClientComponent {  //추상클래스
    

    public void add(ClientComponent client) {
         throw new UnsupportedOperationException();
    }   

    public void remove(ClientComponent client) {
         throw new UnsupportedOperationException();
    }

    public String mtrNmbr() {
         throw new UnsupportedOperationException();
    }

    public double gdlnPrvsMnth() {
         throw new UnsupportedOperationException();
    }

    public double gdln() {
         throw new UnsupportedOperationException();
    }

    public double crctFctr() {
         throw new UnsupportedOperationException();
    }

    public double usg() {
         throw new UnsupportedOperationException();
    }

    public double nmbrFuelQnttIndc() {
         throw new UnsupportedOperationException();
    }

    public double qnttRqst() {
         throw new UnsupportedOperationException();
    }

    public void clientPrint() {
         throw new UnsupportedOperationException();
    }

    public String clientCategory() {
         throw new UnsupportedOperationException();
    }

}
