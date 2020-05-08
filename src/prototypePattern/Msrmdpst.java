package prototypePattern;

import observerPattern.*;

public class Msrmdpst extends Product implements Observer{

    public static String msrmdpst[] = {"이동민", "엄정환", "박상진", "이태건", "김구라", "유재석", "홍길동", "김말자", "황철민", "심청이"};
    public Subject subject;
    
    public Msrmdpst(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void print() {
        System.out.println("예금주명");
        System.out.println("-------------------------------");
        for (int i = 0; i < msrmdpst.length; i++) {
            System.out.print(i + 1 + ".  ");
            System.out.println(msrmdpst[i]);
        }
    }
    
    //Observer로 변경되는 값 
    //s는 테이블의 행값
    public void update(String msrmdpst, String fnncInst, String bankacntnmbr, String pymnmthd, int s){
        this.msrmdpst[s] = msrmdpst;
    }
   

}
