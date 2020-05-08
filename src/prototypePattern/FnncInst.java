package prototypePattern;

import observerPattern.*;

public class FnncInst extends Product implements Observer{

    public static String fnncInst[] = {"국민은행", "기업은행", "부산은행", "농협", "신협", "신한은행", "신한은행", "부산은행", "국민은행", "농협"};
    private Subject subject;
    
    public FnncInst(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void print() {
        System.out.println("금융기관");
        System.out.println("-------------------------------");
        for (int i = 0; i < fnncInst.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(fnncInst[i]);
        }
    }
    
    //Observer로 변경되는 값
    public void update(String msrmdpst, String fnncInst, String bankacntnmbr, String pymnmthd, int s){
        this.fnncInst[s] = fnncInst;
    }

}
