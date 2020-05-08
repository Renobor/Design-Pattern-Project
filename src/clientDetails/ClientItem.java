package clientDetails;

class ClientItem extends ClientComponent {

    private StringBuffer str;
    
    private String mtrNmbr;
    private double gdlnPrvsMnth;
    private double gdln;
    private double crctFctr;
    private double usg;
    private double nmbrFuelQnttlndc;
    private double qnttRqst;

    public ClientItem(String mtrNmbr, double gdlnPrvsMnth, double gdln, double crctFctr, double usg, double nmbrFuelQnttlndc, double qnttRqst) {
        this.mtrNmbr = mtrNmbr;
        this.gdlnPrvsMnth = gdlnPrvsMnth;
        this.gdln = gdln;
        this. crctFctr = crctFctr;
        this.usg = usg;
        this.nmbrFuelQnttlndc = nmbrFuelQnttlndc;
        this.qnttRqst = qnttRqst;
        
        str = new StringBuffer();
    }

    public String mtrNmbr() {
        return mtrNmbr;
    }

    public double gdlnPrvsMnth() {
        return gdlnPrvsMnth;
    }

    public double gdln() {
        return gdln;
    }

    public double crctFctr() {
        return crctFctr;
    }

    public double usg() {
        return usg;
    }

    public double nmbrFuelQnttIndc() {
        return nmbrFuelQnttlndc;
    }

    public double qnttRqst() {
        return qnttRqst;
    }

    public void clientPrint() {
        System.out.println("계량기번호 : " + mtrNmbr());
        System.out.println("전월지침 : " + gdlnPrvsMnth());
        System.out.println("당월지침 : " + gdln());
        System.out.println("보정계수 : " + crctFctr());
        System.out.println("사용량 : " + usg());
        System.out.println("열량계수 : " + nmbrFuelQnttIndc());
        System.out.println("청구량 : " + qnttRqst());   
    }

}
