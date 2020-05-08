package prototypePattern;

import observerPattern.*;

public class Bankacntnmbr extends Product implements Observer{

    public static String bankacntnmbr[] = {"110-311-111111", "123-412-341234", "456-745-674567", "234-523-452345", "789-078-907890", "765-476-547654", "765-476-547654", "098-709-870987", "736-512-341234", "254-325-321234"};
    private Subject subject;
    
    public Bankacntnmbr(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void print() {
        System.out.println("계좌번호");
        System.out.println("-------------------------------");
        for (int i = 0; i < bankacntnmbr.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(bankacntnmbr[i]);
        }
    }
    
    //Observer로 변경되는 값
    public void update(String msrmdpst, String fnncInst, String bankacntnmbr, String pymnmthd, int s){
        this.bankacntnmbr[s] = bankacntnmbr;
    }

}
